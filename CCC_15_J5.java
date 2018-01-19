package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_15_J5 {
    static int[][][] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        int k = Integer.parseInt(stdin.readLine());
        dp = new int[n+1][k+1][n];
        System.out.println(pi(n, k, 1));
    }
    public static int pi(int n, int k, int min){
        if(dp[n][k][min]==0){//not filled in
            if(k==n||k==1)dp[n][k][min] = 1;
            else{
                int s = 0;
                for(int i=min; i<=n/k; i++){
                    s+=pi(n-i, k-1, i);
                }
                dp[n][k][min] = s;
            }
        }
        return dp[n][k][min];
    }
}
