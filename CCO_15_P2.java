package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CCO_15_P2 {
    static int n;
    static int[][] map;
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] one = stdin.readLine().split(" ");
        n = Integer.parseInt(one[0]);
        int m = Integer.parseInt(one[1]);
        map = new int[n][n];
        for(int i=0; i<m; i++){
            String[] line = stdin.readLine().split(" ");
            map[Integer.parseInt(line[0])][Integer.parseInt(line[1])] = Integer.parseInt(line[2]);
        }
        dp = new int[n][1<<n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        System.out.println(dfs(0, 1));


    }
    public static int dfs(int u, int mask){
        if(dp[u][mask]>=0) return dp[u][mask];
        if(u == n-1) return 0;
        for(int i=0; i<n; i++){
            if(map[u][i]>0){
                if((mask & (1<<i)) == 0){
                    dp[u][mask] = Math.max(dp[u][mask], dfs(i, mask|(1<<i))+map[u][i]);
                }
            }
        }
        return dp[u][mask];
    }
}
