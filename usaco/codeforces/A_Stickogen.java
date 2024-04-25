//package usaco.codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class A_Stickogen {

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
        int t = r.nextInt();
        while(t-->0){
            int n = r.nextInt();
            int[] arr = new int[101];
            int[] store = new int[101];
            for(int i=0;i<n;i++){
                store[i]=r.nextInt();
                arr[store[i]]++;
            }
            int cnt =0;
            for(int num:arr){
                if(num >=3 ) cnt+=num/3;
            }
            System.out.println(cnt);
        }
    }
}
