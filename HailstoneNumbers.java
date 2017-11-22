package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HailstoneNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        int count = 0;
        while(n!=1){
            if(n%2==1){
                n*=3;
                n++;
            }else{
                n/=2;
            }
            count++;
        }
        System.out.println(count);
    }
}
