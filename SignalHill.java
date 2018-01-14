package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class SignalHill {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = stdin.readLine().split(" ");
        int b = Integer.parseInt(s1[0]);
        int q = Integer.parseInt(s1[1]);
        ArrayList<Beacon> a = new ArrayList<>();
        for(int i=1; i<=b; i++){
            String[] s2 = stdin.readLine().split(" ");
            a.add(new Beacon(i, Integer.parseInt(s2[0]), Integer.parseInt(s2[1]), Integer.parseInt(s2[2])));
        }
        int[][] map = new int[b+1][b+1];
        for(Beacon x:a){
            for(Beacon y:a){
                if(Math.sqrt(Math.pow((y.x-x.x), 2)+Math.pow((y.y-x.y), 2))<x.r){ //if dist between x and y is less than x.r
                    map[x.i][y.i] = 1;
                }
            }
        }
        /*for(int i=0; i<map.length; i++){
            for(int j=0; j<map.length; j++){
                System.out.print(map[i][j] + " " );
            }
            System.out.println();
        }*/
        for(int i=0; i<q; i++) {
            Queue<Integer> qu = new ArrayDeque<>();
            int[] visited = new int[b+1];
            String[] s = stdin.readLine().split(" ");
            int start = Integer.parseInt(s[0]);
            int end = Integer.parseInt(s[1]);
            qu.add(start);
            visited[start] = 1;
            while(!qu.isEmpty()){
                int curr = qu.poll();
                //System.out.println(curr);
                for(int j=1; j<map.length; j++){
                    //System.out.println(curr+ " " + j + " " +map[curr][j]);
                    if(map[curr][j]!=0 && curr!=j){
                        qu.add(j);
                        visited[j] = 1;
                    }
                }
            }
            if(visited[end]!=0)System.out.println("YES");
            else System.out.println("NO");
            //for(int x:visited)System.out.print(visited[x]);
        }

    }
}
class Beacon{
    public int i, x, y, r;
    public Beacon(int i, int x, int y, int r){
        this.i = i;
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
