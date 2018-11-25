package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AnimeConvention {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] one = stdin.readLine().split(" ");
        int n = Integer.parseInt(one[0]);
        int q = Integer.parseInt(one[1]);
        int[] parents = new int[n+1];
        for(int i=1; i<=n; i++){
            parents[i] = i;
        }
        for(int i=0; i<q; i++){
            String[] in = stdin.readLine().split(" ");
            int a = Integer.parseInt(in[1]);
            int b = Integer.parseInt(in[2]);
            int ap = find(a, parents);
            int bp = find(b, parents);
            if(in[0].equals("A")){ //build road
                if(ap != bp){
                    union(ap, bp, parents);
                }
            }else{ //check road
                if(ap == bp){
                    System.out.println("Y");
                }else{
                    System.out.println("N");
                }
            }
        }
    }
    public static int find(int a, int[] parents){
        if(parents[a] != a){ //not root
            parents[a] = find(parents[a], parents);
        }
        return parents[a];
    }
    public static void union(int a, int b, int[] parents){
        parents[find(b, parents)] = find(a, parents);
    }
}
