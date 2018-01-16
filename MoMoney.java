package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoMoney {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] one = stdin.readLine().split(" " );
        int n = Integer.parseInt(one[0]);
        int t = Integer.parseInt(one[1]);
        String[] two = stdin.readLine().split(" ");
        int[][] dp = new int[n+1][t+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=t; j++){
                
            }
        }
    }
}
