package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ECOO_13_R1_P1 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        int l = 0;
        int s = 0;
        String line = stdin.readLine();
        while(!line.equals("EOF")){
            if(line.equals("TAKE")){
                n++;
                l++;
                if(n>999) n=1;
            }else if(line.equals("SERVE")){
                s++;
            }else if(line.equals("CLOSE")){
                System.out.println(l + " " + (l-s) + " " + n);
                l = 0;
                s = 0;
            }
            line = stdin.readLine();
        }
    }
}
