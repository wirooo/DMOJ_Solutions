package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_04_J3 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(stdin.readLine());
        int n = Integer.parseInt(stdin.readLine());
        String[] adj = new String[a];
        String[] non = new String[n];
        for(int i=0; i<a; i++){
            adj[i] = stdin.readLine();
        }
        for(int i=0; i<n; i++){
            non[i] = stdin.readLine();
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%s as %s\n", adj[i], non[j]);
            }
        }
    }
}
