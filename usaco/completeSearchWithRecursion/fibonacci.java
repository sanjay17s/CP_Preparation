package usaco.completeSearchWithRecursion;

import java.util.Scanner;
// without
public class fibonacci {
    static int cnt =0;
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
        System.out.println(fibo(6));
        System.out.println("Number of times fib called = "+ cnt);

    }

    public static int fibo(int n){
        cnt++;
        if(n<2) return n;
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }

}
