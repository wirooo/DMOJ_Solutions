package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class CCC_08_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(stdin.readLine());
        for(int testcase=0; testcase<t; testcase++){
            int r = Integer.parseInt(stdin.readLine());
            int c = Integer.parseInt(stdin.readLine());
            int[][] map = new int[r+1][c+1];
            for(int i=1; i<=r; i++){
                String[] line = stdin.readLine().split("");
                for(int j=1; j<=c; j++){
                    map[i][j] = Integer.parseInt(line[j-1]);
                }
            }
            //System.out.println(dfs(map, r, c));
        }
    }
    /*public static int dfs(int[][] map, int r, int c){
        int[][] dist = new int[r+1][c+1];
        for(int i=0; i<r; i++){
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[1][1] = 0;
        Queue<MazePair<Integer, Integer>> q = new ArrayDeque<>();
        q.add(new MazePair<>(1, 1));
        while(!q.isEmpty()){
            MazePair curr = q.poll();

        }
    }*/
}

class MazePair<X, Y>{
    public X x;
    public Y y;
    public MazePair(X x, Y y){
        this.x = x;
        this.y = y;
    }
}
