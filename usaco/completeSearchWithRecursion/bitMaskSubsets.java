package usaco.completeSearchWithRecursion;

import java.io.*;
import java.util.*;

public class bitMaskSubsets {

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
       List<Integer> list = new ArrayList<>();
       list.add(1);
      list.add(2);
      list.add(3);
      List<List<Integer>> res = new ArrayList<>();

      int n = list.size();
      for(int mask=0;mask<(1<<n);mask++){
         List<Integer> l = new ArrayList<>();
          for(int i=0;i<n;i++){
              if((mask & (1<<i)) > 0){
                    l.add(list.get(i));
              }
          }
          res.add(l);
      }
      pw.println(res);
        pw.close();
    }




}

