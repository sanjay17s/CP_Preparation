package usaco.dp;

import java.util.Arrays;

// dp
public class fibonacci {
    static int cnt =0;
    static int[] cache = new int[50];

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
        Arrays.fill(cache,-1);
        System.out.println(fibo(6));
        System.out.println("Number of times fib called = "+ cnt);

    }

    public static int fibo(int n){
        cnt++;
        if(n<2) return n;
        if(cache[n] !=-1) return cache[n];

        cache[n]= fibo(n-1)+fibo(n-2);
        return cache[n];

    }

}
