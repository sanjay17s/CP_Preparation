package usaco.completeSearchWithRecursion;

import java.io.*;
import java.util.*;

public class tracingUsco {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("tracing");
        int n = io.nextInt();
        int l=io.nextInt();
        char[] ch = io.next().toCharArray();
        int[] status = new int [n+1];
        int cows=0;
        for(int i = 1 ; i <= n ; i ++)
            status[i] = ch[i-1] - '0';
        ArrayList<Tuple<Integer,Integer,Integer>> log = new ArrayList<>();
        boolean [] cnt = new boolean[n+1];
        Arrays.fill(cnt, false);
        for(int i=0;i<l;i++){
            int t = io.nextInt();
            int x=io.nextInt();
            int y=io.nextInt();
            log.add(new Tuple<>(t,x,y));
        }
        Collections.sort(log);
        int mink=250;
        int maxk=0;

        for(int po=1;po<=n;po++){
            for(int k=0;k<=l;k++){
                int [] infected = new int[n+1];
                int[] remaining = new int[n+1];
                infected[po]=1;
                remaining[po]=k;

                for(Tuple<Integer,Integer,Integer> t: log){
                    if(infected[t.b] ==1 && infected[t.c]==1){
                        remaining[t.b]=Math.max(remaining[t.b]-1,0 );
                        remaining[t.c]=Math.max(remaining[t.c]-1,0 );
                    } else if (infected[t.b]==1 && remaining[t.b]>0) {
                        infected[t.c] =1;
                        remaining[t.c]=k;
                        remaining[t.b]--;
                    } else if (infected[t.c]==1 && remaining[t.c]>0) {
                        remaining[t.c]--;
                        infected[t.b]=1;
                        remaining[t.b]=k;
                    }
                }
                boolean valid =true;
                for(int i=1;i<=n;i++){
                    if(infected[i]!=status[i]){
                        valid=false;
                    }
                }
                if(valid){
                    if(!cnt[po]){
                        cnt[po]=true;
                        cows++;
                    }
                    mink=Math.min(mink,k);
                    maxk=Math.max(k,maxk);
                }
            }
        }
        io.println(cows+" "+mink+" "+(maxk==l?"Infinity":maxk));
        io.close();
    }
    static class Tuple<K, V, X> implements Comparable<Tuple>{
        K a;
        V b;
        X c;

        public Tuple(K a, V b, X c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public String toString(){
            return a + " " + b + " " + c;
        }

        @Override
        public int compareTo(Tuple o){
            return (Integer)a - (Integer)o.a;
        }
    }





    //BeginCodeSnip{Kattio}
    static class Kattio extends PrintWriter {
        private BufferedReader r;
        private StringTokenizer st;
        // standard input
        public Kattio() { this(System.in, System.out); }
        public Kattio(InputStream i, OutputStream o) {
            super(o);
            r = new BufferedReader(new InputStreamReader(i));
        }
        // USACO-style file input
        public Kattio(String problemName) throws IOException {
            super(problemName + ".out");
            r = new BufferedReader(new FileReader(problemName + ".in"));
        }
        // returns null if no more input
        public String next() {
            try {
                while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(r.readLine());
                return st.nextToken();
            } catch (Exception e) { }
            return null;
        }
        public int nextInt() { return Integer.parseInt(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public long nextLong() { return Long.parseLong(next()); }
    }
    //EndCodeSnip
}
