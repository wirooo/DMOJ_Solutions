package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_05_J2 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(stdin.readLine());
        int b = Integer.parseInt(stdin.readLine());
        int count = 0;
        for(int i=a; i<=b; i++){
            int numOfFactors = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0) numOfFactors++;
            }
            if(numOfFactors==4) count++;
        }
        System.out.println("The number of RSA numbers between " + a + " and " + b + " is " + count);
    }
}
