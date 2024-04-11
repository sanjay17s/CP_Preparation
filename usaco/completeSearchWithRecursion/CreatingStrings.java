package usaco.completeSearchWithRecursion;

import java.io.*;
import java.util.*;

public class CreatingStrings {
// https://cses.fi/problemset/task/1622/
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
        Set<String> list = new HashSet<>();
        createString(s,list);
        List<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        pw.println(sortedList.size());
        for (String ss : sortedList) {
            pw.println(ss);
        }
        pw.close();
    }

    public static void createString(String s, Set<String> list){
        createStrings(s,"",list);
    }

    private static void createStrings(String s ,String content,   Set<String> list){
        if(s.isEmpty()){
            list.add(content);
        }
        else{
            StringBuilder sb = new StringBuilder(s);
            for(int i=0;i<s.length();i++){
                char ch =s.charAt(i);
                sb.deleteCharAt(i);
                createStrings(sb.toString(),content+ch,list);
                sb.insert(i,ch);
            }
        }
    }

}
