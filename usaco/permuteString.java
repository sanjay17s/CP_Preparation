package usaco;

import java.io.*;
import java.util.*;

public class permuteString {

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
        String s ="math";
        backtrack(s);

        pw.close();
    }



    public static void backtrack(String s){
        backtrack(s,"");
    }

   public static void backtrack(String s ,String content){
        if(s.isEmpty()){
            pw.println(content);
        }
        else{
            StringBuilder sb = new StringBuilder(s);
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                sb.deleteCharAt(i);
                backtrack(sb.toString(),content+ch);
                sb.insert(i,ch);
            }
        }
   }



}









