//package usaco.completeSearchWithRecursion;

import java.io.*;
import java.util.*;

public class A_Yogurt_Sale_CF {

    static int n;
    static int[] arr;

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
        int t =r.nextInt();
        while(t-->0){
            int n = r.nextInt();
            int a = r.nextInt();
            int b = r.nextInt();

            int forTwo = Math.min(a * 2, b);
            int ans = 0;
            int even = n / 2;
            int odd = n % 2;
            if (even > 0) {
                ans = even * forTwo + odd * a;
            } else {
                ans = a;
            }
            pw.println(ans);
        }

        pw.close();
    }
}