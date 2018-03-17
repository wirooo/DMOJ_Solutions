package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheOddNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int n = Integer.parseInt(stdin.readLine());
        for(int i=0; i<n; i++){
            a^=Integer.parseInt(stdin.readLine());
        }
        System.out.println(a);
    }
}
