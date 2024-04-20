package usaco.completeSearchWithRecursion;

// dp
public class fiboTwoTypesOfDp {
    static int cnt =0;
    static int[] dp = new int[50];

    public static void main(String[] args) {

       dp[0]=0;
       dp[1]=1;
        // receiving DP

        for(int i=2;i<21;i++){
           dp[i] = dp[i-1]+dp[i-2];
       }

        // distributing DP
        for(int i=0;i<21;i++){
            dp[i+1]+=dp[i];
            dp[i+2]+=dp[i];
        }

    }

}
