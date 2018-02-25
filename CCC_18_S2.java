package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_18_S2 {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        int[][] a = new int[n][n];
        for(int i=0; i<n; i++){
            String[] l = stdin.readLine().split(" ");
            for(int j=0; j<n; j++){
                a[i][j] = Integer.parseInt(l[j]);
            }
        }
        for(int i=0; i<4; i++){
            if(check(a, n)){
                print2d(a, n);
                break;
            }
            else rotate(a, n);
        }

    }
    public static boolean check(int[][] a, int n){
        for(int i=0; i<n; i++){
            if(i!=n-1) if(a[i+1][0]<a[i][0]) return false;
            for(int j=0; j<n-1; j++){
                if(a[i][j+1] < a[i][j]) return false;
            }
        }
        return true;
    }
    public static void rotate(int[][] a, int n){
        int[][] b = new int[n][n];
        int x = 0;
        int y = n-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                b[x][y] = a[i][j];
                x++;
            }
            x = 0;
            y--;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = b[i][j];
            }
        }
    }
    public static void print2d(int[][] a, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
