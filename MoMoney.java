package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoMoney {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] one = stdin.readLine().split(" ");
        int n = Integer.parseInt(one[0]);
        int t = Integer.parseInt(one[1]);
        String[] two = stdin.readLine().split(" ");
        int[][] dp = new int[n+1][t+1];
        for(int i=1; i<=n; i++){
            int v = Integer.parseInt(two[i-1]);
            for(int j=1; j<=t; j++){
                if(v==j){ //coin value equal to target
                    dp[i][j] = dp[i-1][j]+1;
                }else if(v>j){ //coin value larger than target (can't pick it)
                    dp[i][j] = dp[i-1][j];
                }else{ //coin value smaller than target (can pick)
                    int temp = dp[i-1][j-v];
                    if(temp == 0){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i-1][j] + dp[i-1][j-v];
                    }
                }
            }
        }
        /*for(int i=0; i<n+1; i++){
            for(int j=0; j<t+1; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }*/
        System.out.println(dp[n][t]);
    }
}
