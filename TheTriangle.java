package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        int[][] v = new int[n][n];
        for(int i=0; i<n; i++){
            String[] in = stdin.readLine().split(" ");
            for(int j=0; j<=i; j++){
                v[i][j] = Integer.parseInt(in[j]);
            }
        }
        for(int i=n-2; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(v[i][j]!=0){
                    v[i][j] += Math.max(v[i+1][j], v[i+1][j+1]);
                }
            }
        }
        /*for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
