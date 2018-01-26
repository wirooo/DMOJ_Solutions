package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonSubsequence {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] one = stdin.readLine().split(" ");
        int n = Integer.parseInt(one[0]);
        int m = Integer.parseInt(one[1]);
        int[] a = new int[n+1];
        int[] b = new int[m+1];
        int[][] dp = new int[n+1][m+1];
        String[] two = stdin.readLine().split(" " );
        for(int i=1; i<a.length; i++){
            a[i] = Integer.parseInt(two[i-1]);
        }
        String[] thr = stdin.readLine().split(" " );
        for(int i=1; i<b.length; i++){
            b[i] = Integer.parseInt(thr[i-1]);
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(a[i]==b[j])dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        System.out.println(dp[n][m]);
    }
}
