package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CCC_17_S4 {
    static Pipe[] edges;
    static int[] p;
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] one = stdin.readLine().split(" ");
        int n = Integer.parseInt(one[0]);
        int m = Integer.parseInt(one[1]);
        int ans = 0;
        p = new int[n+1];
        for(int i=1; i<=n; i++){
            p[i] = i;
        }
        edges = new Pipe[m];
        for(int i=0; i<n; i++) {
            int f = 1;
            if (i < n - 1) f = 0;
            String[] pipein = stdin.readLine().split(" ");
            edges[i] = new Pipe(Integer.parseInt(pipein[0]), Integer.parseInt(pipein[1]), Integer.parseInt(pipein[2]), f);
        }
        Arrays.sort(edges);
        int count = 1;
        int pipec = 0;
        while(count<n){
//            System.out.println(count);
//            for(int i=0; i<p.length; i++){
//                System.out.print(i + ":" + p[i] + " ");
//            }
//            System.out.println();
            Pipe x = edges[pipec];
            int ap = find(x.a);
            int bp = find(x.b);
            if(ap != bp){
                ans+=x.f;
                p[ap] = p[bp];
                count++;
            }
            pipec++;
        }
        System.out.println(ans);
        /*for(Pipe x:edges){
            System.out.println(x.c);
        }*/
    }
    public static int find(int a){
        if(p[a] != a){ //not root
            p[a] = find(p[a]);
        }
        return p[a];
    }
}
class Pipe implements Comparable<Pipe>{
    public int a; int b; int c; int f;
    public Pipe(int a, int b, int c, int f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f; //0 = old, 1 = new
    }
    @Override
    public int compareTo(Pipe other){
        if(this.c != other.c){
            return Integer.compare(this.c, other.c);
        }
        return Integer.compare(this.f, other.f);
    }
}
