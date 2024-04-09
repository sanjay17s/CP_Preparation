package usaco.completeSearchWithRecursion;

import java.io.*;
import java.util.*;

public class sublists {

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
        List<String> list = new ArrayList<>();
        list.add("jane");
        list.add("bob");
        list.add("matt");
        list.add("hen");
       List<List<String>> res = new ArrayList<>();
        sublists(list,res);
        pw.println(res);
        pw.close();
    }



    public static void sublists(List<String> s,List<List<String>> res){
        sublists(s,new ArrayList<>(),res);
    }

   public static void sublists(List<String> s,List<String> l,List<List<String>> res){
        if(s.isEmpty()){
           res.add(new ArrayList<>(l));
       }
       else{
           String ad=s.get(0);
           s.remove(0);
           l.add(ad);
           sublists(s,l,res);
           l.remove(ad);
           sublists(s,l,res);
           s.add(0,ad);
       }
   }



}









