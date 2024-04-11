package usaco.completeSearchWithRecursion;

import java.util.Scanner;

public class palindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       boolean ans = palindrome(s);
        System.out.println(ans);
    }

    public static boolean palindrome(String s){
        if(s.length()<2){
            return true;
        }
        else{
            char f=s.charAt(0);
            char l=s.charAt(s.length()-1);
            if(f == l){
                return  palindrome(s.substring(1,s.length()-1));
            }
            else
                return false;

        }
    }
}
