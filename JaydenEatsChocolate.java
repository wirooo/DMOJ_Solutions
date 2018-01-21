package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JaydenEatsChocolate {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        String[] one = stdin.readLine().split(" " );
        int[] dp = new int[n+1];
        for(int i=0; i<3; i++){
            for(int j=0; j<dp.length; j++){
                if(Integer.parseInt(one[i])==j){
                    dp[j] = Math.max(1, dp[j]);
                }else if(j>Integer.parseInt(one[i])){
                    if(dp[j-Integer.parseInt(one[i])]!=0) dp[j] = Math.max(dp[j-Integer.parseInt(one[i])]+1, dp[j]);
                }
            }
        }
        //for(int i:dp)System.out.print(i+ " ");
        System.out.println(dp[n]);
    }
}
