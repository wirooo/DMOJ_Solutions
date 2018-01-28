package november_26_2016;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PursuitofKnowledge {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int T = s.nextInt();
		int[][] adjacency = new int[N+1][N+1];
		for(int i=0; i<M; i++){
			int a = s.nextInt();
			int b = s.nextInt();
			adjacency[a][b]=1;
		}
		int Q = s.nextInt();
		for(int i=0; i<Q; i++){
			Queue<Integer> q = new LinkedList<Integer>();
			boolean[] visited = new boolean[N+1];
			int[] distance = new int[N+1];
			int a = s.nextInt();
			q.add(a);
			visited[a] = true;
			int d=0;
			while(!q.isEmpty()){
				int cur = q.poll();
				d += 1;
				for(int j=0; j<M; j++){
					if(adjacency[cur][j]==1){
						visited[adjacency[cur][j]] = true;
						distance[adjacency[cur][j]] += d;
					}
				}
			}
			int b = s.nextInt();
			if(visited[b]=true)System.out.println(distance[b]);
			else System.out.println("Not enough hallways!");
		}

	}
}
