package december_3_2016;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KnightHop {
static int[] xchange = {1, 2, 2, 1, -1, -2, -2, -1};
static int[] ychange = {2, 1, -1, -2, -2, -1, 1, 2};
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Queue<Point> q = new LinkedList<Point>();
		boolean vis[][] = new boolean[65][65];
		int dis[][] = new int[65][65];
		Point start = new Point(s.nextInt(), s.nextInt());
		Point end = new Point(s.nextInt(), s.nextInt());
		q.add(start);
		vis[start.x][start.y] = true;
		while(!q.isEmpty()){
			Point n = q.poll();
				for(int i=0; i<8; i++){
					int xn = n.x+xchange[i];
					int yn = n.y+ychange[i];
					if(xn>=1 && xn<9 && yn>=1 && yn<=9 && !vis[xn][yn]){
						q.add(new Point(xn, yn));
						vis[xn][yn] = true;
						dis[xn][yn] = dis[n.x][n.y] + 1;
						
					}
				}
				
		}
		if(vis[end.x][end.y]){
			System.out.println(dis[end.x][end.y]);
		}
		

	}
	static class Point{
		int x, y;
		Point(int x0, int y0){x=x0; y=y0;}
	}

}
