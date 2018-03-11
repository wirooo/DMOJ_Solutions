package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_04_S4 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(stdin.readLine());
        int nc = Integer.parseInt(stdin.readLine());
        int[] m = new int[d+1];
        for(int i=0; i<m.length; i++) m[i] = Integer.MAX_VALUE;
        int[] c = new int[nc];
        for(int i=0; i<nc; i++) c[i] = Integer.parseInt(stdin.readLine());
        m[0] = 0;
        for(int i=0; i<=d; i++){
            if(m[i] != Integer.MAX_VALUE) {
                for (int j = 0; j < nc; j++) {
                    if (i + c[j] <= d) {
                        m[i + c[j]] = Math.min(m[i + c[j]], m[i] + 1);
                    }
                }
            }
        }
        //for(int i:m) System.out.print(i + " ");
        if(m[d] == Integer.MAX_VALUE) System.out.println("Roberta acknowledges defeat.");
        else System.out.printf("Roberta wins in %d strokes.", m[d]);
    }
}