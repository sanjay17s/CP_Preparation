//package usaco.codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class GridGame {
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
       String s = r.next();
        int h = 0,v=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '0') {
                pw.print(1);
                pw.print(" ");
                pw.println(1+v);
                v=(v+1)%4;
            }
            else {
                pw.print(3);
                pw.print(" ");
                pw.println(1+h);
                h=(h+2)%4;
            }
        }
        pw.close();
    }
}
