package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_08_S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        boolean flg = true;
        while (flg) {
            int n = Integer.parseInt(stdin.readLine());
            int numOfPoints = 0;
            if(n != 0){
                for(int i=1; i <= n; i++){
                    for(int j=1; j <= n; j++){
                        if((j*j) + (i*i) <= (n*n)){
                            numOfPoints++;
                        }
                    }
                }
                System.out.println((4*numOfPoints) + (4*n) + 1);
            }else{
                flg = false;
            }
        }
    }
}
