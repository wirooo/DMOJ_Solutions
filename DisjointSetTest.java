package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DisjointSetTest {
        public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = stdin.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        int[] p = new int[n+1];
        for(int i=1; i<=n; i++){
            p[i] = i;
        }
        ArrayList<Integer> l = new ArrayList<>();
        int c = 0;
        for(int i=1; i<=m; i++){
            String[] s = stdin.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int fx = find(x, p);
            int fy = find(y, p);
            if(fx != fy){
                union(fx, fy, p);
                c++;
                l.add(i);
            }
            if(c == n-1)break;
        }
        if(c == n-1)for(int i:l) System.out.println(i);
        else System.out.println("Disconnected Graph");

    }
    public static int find(int x, int[] p){
        if(p[x]!=x){ //if x is not root
            p[x] = find(p[x], p);
        }
        return p[x];
    }
    public static void union(int x, int y, int[] p){
        p[find(x, p)] = find(y, p);
    }
}
