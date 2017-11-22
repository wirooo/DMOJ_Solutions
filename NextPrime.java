package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextPrime {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        boolean flg = true;
        int num = n;
        while(flg){
            //check if it is prime
            if(check(num)) flg = false;
            else num++;
        }
        System.out.println(num);
    }
    public static boolean check(int n){
        if(n == 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i=3; i<=Math.sqrt(n); i+=2){
            if(n%i == 0) return false;
        }
        return true;
    }
}
