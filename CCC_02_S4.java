package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_02_S4 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(stdin.readLine());
        int q = Integer.parseInt(stdin.readLine());
        /*BridgePair[] a = new BridgePair[q+1];
        for(int i=1; i<=q; i++){
            String name = stdin.readLine();
            int t = Integer.parseInt(stdin.readLine());
            a[i] = new BridgePair(name, t);
        }*/
        int[][] dp = new int[q+1][m+1];
        for(int i=1; i<=q; i++){
            String name = stdin.readLine();
            int t = Integer.parseInt(stdin.readLine());
            for(int j=1; j<=m; j++){
                if(j == 1) dp[i][j] = dp[i-1][j] + t;
                else{
                    dp[i][j] = dp[i][j-1] - dp[i-1][j];
                }
            }
        }
        for(int i=0; i<=q; i++){
            for(int j=0; j<=m; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(dp[q][m]);

    }
}
class BridgePair<X, Y>{
    public X x;
    public Y y;
    public BridgePair(X x, Y y){
        this.x = x;
        this.y = y;
    }
}
