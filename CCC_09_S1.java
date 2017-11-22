package DMOJPractice.DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_09_S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(stdin.readLine());
        int b = Integer.parseInt(stdin.readLine());
        int num = 1;
        int count = 0;
        while(Math.pow(num, 6)<=b){
            if(Math.pow(num, 6)>=a) count++;
            num++;
        }
        System.out.println(count);
    }
}
