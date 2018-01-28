package november_19_2016;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CrossingField {
static int [] dr = {-1, 0, 1, 0};
static int [] dc = {0, -1, 0, 1};
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int H = s.nextInt();
		int[][] field = new int[N+1][N+1];
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				field[j][i] = s.nextInt();
			}
		}
		Queue<Point> Q = new LinkedList<Point>();
		boolean [][] vis = new boolean[N+1][N+1];
		Q.add(new Point(1, 1)); vis[1][1] = true;
		while(!Q.isEmpty()){
			Point cur = Q.poll();
			for(int i=0; i<4; i++){
				int nr = cur.r+dr[i], nc = cur.c+dc[i]; //find next location
				if(nr>=1 && nr<=N && nc >=1 && nc<=N && !vis[nr][nc] && Math.abs(field[nr][nc] - field[cur.r][cur.c])<=H){
					Q.add(new Point(nr, nc)); vis[nr][nc]= true;
				}
			}
		}
		if(vis[N][N])System.out.println("yes");
		else System.out.println("no");
	}
	static class Point {
		int r, c;
		Point(int r0, int c0){r=r0; c=c0;}
	}

}
