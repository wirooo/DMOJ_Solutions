package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CCO_15_P2 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] one = stdin.readLine().split(" ");
        int n = Integer.parseInt(one[0]);
        int m = Integer.parseInt(one[1]);
        int[][] map = new int[n][n];
        for(int i=0; i<m; i++){
            String[] line = stdin.readLine().split(" ");
            map[Integer.parseInt(line[0])][Integer.parseInt(line[1])] = Integer.parseInt(line[2]);
        }
        int[] dist = new int[n];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int i=0; i<n; i++){
                if(map[curr][i]!=0){
                    if(dist[curr]+map[curr][i]>dist[i]){
                        dist[i] = dist[curr]+map[curr][i];
                        q.add(i);
                    }
                }
            }
        }
        System.out.println(dist[n-1]);
    }
}
