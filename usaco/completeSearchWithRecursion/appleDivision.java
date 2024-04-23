//package usaco.completeSearchWithRecursion;

import java.io.*;
import java.util.*;

public class appleDivision {

    static int n ;
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
         n = r.nextInt();
         arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=r.nextInt();
        pw.println(appleDivision(0,0,0));
        pw.close();
    }

    public static long appleDivision(int index,long sum1,long sum2){
        if(index == n){
            return Math.abs(sum1-sum2);
        }


    return Math.min(  appleDivision(index+1, sum1 + arr[index],  sum2),
            appleDivision(index+1, sum1 ,  sum2+arr[index]));



    }


}














