package DMOJPractice.DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_10_J2 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(stdin.readLine());
        int b = Integer.parseInt(stdin.readLine());
        int c = Integer.parseInt(stdin.readLine());
        int d = Integer.parseInt(stdin.readLine());
        int s = Integer.parseInt(stdin.readLine());

        int nikkipos = 0;
        int byronpos = 0;
        int nikkicount = a;
        boolean nikkiforward = true;
        boolean byronforward = true;
        int byroncount = c;
        for(int i=0; i<s; i++){
            if(nikkicount == 0){
                if(nikkiforward){
                    nikkiforward = false;
                    nikkicount = b;
                }else{
                    nikkiforward = true;
                    nikkicount = a;
                }
            }
            if(byroncount == 0){
                if(byronforward){
                    byronforward = false;
                    byroncount = d;
                }else{
                    byronforward = true;
                    byroncount = c;
                }
            }
            if(nikkiforward){
                nikkipos++;
                nikkicount--;
            }else{
                nikkipos--;
                nikkicount--;
            }
            if(byronforward){
                byronpos++;
                byroncount--;
            }else{
                byronpos--;
                byroncount--;
            }
        }
        if(nikkipos>byronpos) System.out.println("Nikky");
        else if (byronpos>nikkipos) System.out.println("Byron");
        else System.out.println("Tied");
    }
}
