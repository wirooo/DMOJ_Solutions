package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfPrimes {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int max = 0;
        for(int i=0; i<5; i++){
            int x = Integer.parseInt(stdin.readLine());
            a[i] = x;
            if(x>max) max = x;
        }
        int[] pre = new int[100001];
        pre[2] = 2;
        for(int i=3; i<=max; i++){
            if(isPrime(i)) pre[i] = i + pre[i-1];
            else pre[i] = pre[i-1];
        }
        for(int i=0; i<5; i++){
            System.out.println(pre[a[i]]);
        }
        //for(int i=0; i<30; i++) System.out.println(i + " " + pre[i]);
    }
    public static boolean isPrime(int n){
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
