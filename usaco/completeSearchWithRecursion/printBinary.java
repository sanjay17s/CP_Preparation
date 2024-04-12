package usaco.completeSearchWithRecursion;

import java.io.*;
import java.util.*;

public class printBinary {

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
        // write a recursive function that takes in a int number of digits and prints all binary numbers that
        // have exactly that many digits

        int digits=r.nextInt();
        printBinary(digits);
        pw.close();
    }

    public static void printBinary(int d) {
        printBinary(d,"");
    }

    private static void printBinary(int d,String ans){
        if(d==0){
            pw.println(ans);
        }
        else{
            for(int i=0;i<2;i++){
                printBinary(d-1,ans+i);
            }
        }
    }
}
