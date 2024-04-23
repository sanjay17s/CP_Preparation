package usaco.completeSearchWithRecursion;

public class Remove_K_Digits {
    public static void main(String[] args) {
        String num="10200";
        int k = 1;
        int[] arr=new int[1];
        arr[0]=Integer.MAX_VALUE;
        backtrack(num,k,arr);
        System.out.println(String.valueOf(arr[0]));
    }
    public static void backtrack(String num, int k, int[] arr) {
        if (k == 0) {
            if (num.length() == 0) {
                arr[0] = 0;
            } else {
                arr[0] = Math.min(Integer.parseInt(num), arr[0]);
            }
        } else {
            StringBuilder sb = new StringBuilder(num);
            for (int i = 0; i < num.length(); i++) {
                char ch = sb.charAt(i);
                sb.deleteCharAt(i);
                backtrack(sb.toString(), k - 1, arr);
                sb.insert(i, ch); // Insert the character back at the same index
            }
        }
    }

}
