//package usaco.codeforces;//package usaco.codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class UnnaturalConditions {

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

        for(int i=0;i<1131;i++) {
            pw.print(1);
        }
        pw.println();
        for(int i=1;i<1131;i++) {
            pw.print(8);
        }
        pw.print(9);
        pw.close();
    }
}
