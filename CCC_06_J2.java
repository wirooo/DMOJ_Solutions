package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_06_J2 {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(stdin.readLine());
        int n = Integer.parseInt(stdin.readLine());
        int count = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i + j == 10){
                    count++;
                }
            }
        }
        if(count != 1)System.out.printf("There are %d ways to get the sum 10.", count);
        else System.out.println("There is 1 way to get the sum 10.");
    }
}
