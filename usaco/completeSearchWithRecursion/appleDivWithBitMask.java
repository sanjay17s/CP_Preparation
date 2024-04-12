//package usaco.completeSearchWithRecursion;

import java.io.*;
import java.util.*;

public class appleDivWithBitMask {



    public static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
                return tokenizer.nextToken();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = r.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=r.nextInt();
       long diff=Integer.MAX_VALUE;
        for(int mask=0;mask<(1<<n);mask++){
            long sum1=0;
            long sum2=0;
            for(int i=0;i<n;i++){

                if((mask & (1<<i)) >0){
                    sum1+=arr[i];
                }
                else{
                    sum2+=arr[i];
                }
            }
            diff = Math.min(diff,Math.abs(sum1-sum2));

        }
        pw.println(diff);
        pw.close();
    }



}
