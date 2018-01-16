package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimonandMarcy {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = stdin.readLine().split(" " );
        int c = Integer.parseInt(s1[0]); //c=cage number
        int m = Integer.parseInt(s1[1]); //m=max mins
        cage[] a = new cage[c+1];
        for(int i=1; i<a.length; i++){
            String[] s2 = stdin.readLine().split(" " );
            a[i] = new cage(i, Integer.parseInt(s2[0]), Integer.parseInt(s2[1]));
        }
        int[][] dp = new int[c+1][m+1];
        for(int i=0; i<=c; i++){
            for(int j=0; j<=m; j++){
                if(i==0||j==0) dp[i][j] = 0;
                else if(a[i].k>j) dp[i][j] = dp[i-1][j];
                else{
                    dp[i][j] = Math.max(dp[i-1][j], a[i].n+dp[i-1][j-a[i].k]);
                }
            }
        }
        System.out.println(dp[c][m]);
    }
}
class cage{
    public int i, n, k; //k=requests, n=princesses
    public cage(int i, int n, int k){
        this.i = i;
        this.n = n;
        this.k = k;
    }
}
