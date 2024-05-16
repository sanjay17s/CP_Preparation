//package usaco.codeforces;

import java.io.*;
import java.util.*;

public class ThreePalindrome {



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
        StringBuilder sb = new StringBuilder();
        char[] ch = {'a','b','c'};
        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) {
                if(i <2) {
                    sb.append(ch[j]);
                    break;
                }
                else {
                    if(ch[j] == sb.charAt(i-2)) {
                        continue;
                    }
                    else {
                        sb.append(ch[j]);
                        break;
                    }
                }
            }
        }
        pw.println(sb.toString());
        pw.close();
    }



}
