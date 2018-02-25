package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//new group: dp[i] = dp[i-1] + t[i]
//in a group with i-x: dp[i] = dp[i-x-1] + Math.max(t[i], t[i-x]), 1<=x<=m

public class CCC_02_S4 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(stdin.readLine());
        int q = Integer.parseInt(stdin.readLine());
        int[] dp = new int[q+1];
        String[] names = new String[q+1];
        int[] t = new int[q+1];
        int[] groups = new int[q+1];
        for(int i=1; i<=q; i++){
            names[i] = stdin.readLine();
            t[i] = Integer.parseInt(stdin.readLine());
        }
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1; i<=q; i++){
            int max = t[i];
            for(int j=1; j<=m; j++){
                if(i-j<0)break;
                if(dp[i]>dp[i-j]+max){
                    dp[i] = dp[i-j]+max;
                    groups[i] = i-j;
                }
                max = Math.max(max, t[i-j]);
            }
        }

        for(int i:dp)System.out.print(i+ " ");
    }
}
