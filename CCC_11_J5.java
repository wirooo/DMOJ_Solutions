package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_11_J5 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        int[] m = new int[n+1];
        for(int i=0; i<m.length; i++){
            m[i]=1;
        }
        for(int i=1; i<n; i++){
            int x = Integer.parseInt(stdin.readLine());
            m[x] = m[x] * (1+m[i]);
        }
        System.out.println(m[n]);
    }
}
