package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deforestation {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        int[] t = new int[n+1];
        for(int i=1; i<=n; i++){
            t[i] = Integer.parseInt(stdin.readLine()) + t[i-1];
        }
        int q = Integer.parseInt(stdin.readLine());
        for(int i=0; i<q; i++){
            String[] s = stdin.readLine().split(" ");
            int l = Integer.parseInt(s[0])+1;
            int r = Integer.parseInt(s[1])+1;
            System.out.println(t[r]-t[l-1]);
        }
    }
}
