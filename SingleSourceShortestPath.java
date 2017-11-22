package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SingleSourceShortestPath {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] one = stdin.readLine().split(" ");
        int n = Integer.parseInt(one[0]);
        int m = Integer.parseInt(one[1]);

        int[][] edges = new int[n+1][n+1]; //2darray of edge lens
        Queue<Integer> q = new LinkedList<>(); //queue of untravelled nodes
        int[] distFromSource = new int[n+1]; //distance of each node from source
        Arrays.fill(distFromSource, 99999999);
        distFromSource[1] = 0;
        for(int i=0; i<edges.length; i++){
            for(int j=0; j<edges.length; j++){
                edges[i][j] = 999999990;
            }
        }
        for(int i=0; i<m; i++){
            String[] s = stdin.readLine().split(" ");
            int v1 = Integer.parseInt(s[0]);
            int v2 = Integer.parseInt(s[1]);
            int w = Integer.parseInt(s[2]);
            edges[v1][v2] = Math.min(edges[v1][v2], w);
            edges[v2][v1] = Math.min(edges[v2][v1], w);
        }
        for(int i=1; i<edges.length; i++){ //add all nodes connected to source
            if(edges[1][i] != 0) q.add(i);
        }
        while(!q.isEmpty()){
            int currentNode = q.poll();
            for(int neighbourNode=0; neighbourNode<edges.length; neighbourNode++){
                if(edges[currentNode][neighbourNode] != 0) {
                    int edgeLen = edges[currentNode][neighbourNode];
                    int d = distFromSource[currentNode] + edgeLen;
                    if (d < distFromSource[neighbourNode]) {
                        distFromSource[neighbourNode] = d;
                        q.add(neighbourNode);
                    }
                }
            }
        }
        for(int i=1; i<=n; i++){
            if(distFromSource[i] != 99999999) System.out.println(distFromSource[i]);
            else System.out.println(-1);
        }
    }
}
