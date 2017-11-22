package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_14_J2 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        String s = stdin.readLine();
        int a = 0;
        int b = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A') a++;
            else b++;
        }
        if(a>b) System.out.println('A');
        else if (a<b) System.out.println('B');
        else System.out.println("Tie");
    }
}
