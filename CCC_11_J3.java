package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_11_J3 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(stdin.readLine());
        int b = Integer.parseInt(stdin.readLine());
        System.out.println(sumac(a, b, 2));

    }

    public static int sumac(int a, int b, int len){
        if(a < b) return len;
        else return sumac (b, a-b, len+1);
    }
}
