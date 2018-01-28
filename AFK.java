package december_3_2016;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AFK {
static int[] xchange = {1, 0, -1, 0};
static int[] ychange = {0, -1, 0, 1};
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0; i<t; i++){
			int l = s.nextInt();
			int w = s.nextInt();
			String[][] floor = new String[l+1][w+1];
			boolean[][] vis = new boolean[l+1][w+1];
			int[][] dis = new int[l+1][l+1];
			Point comp = null;
			Point wash = null;
			for(int j=0; j<l; j++){
				for(int j1=0; j1<w; j1++){
					String in = s.next();
					floor[j][j1] = in;
					if(in.equals("C")){
						comp = new Point(j, j1);
					}
					if(in.equals("W")){
						wash = new Point(j, j1);
					}
				}
			}
			Queue<Point> q = new LinkedList<Point>();
			q.add(comp);
			vis[comp.x][comp.y] = true;
			while(!q.isEmpty()){
				Point n = q.poll();
				for(int e=0; e<4; e++){
					int xn = n.x + xchange[e];
					int yn = n.y + ychange[e];
					if(xn>=1 && xn <=l && yn>=1 && yn<=w && !vis[xn][yn] && !floor[xn][yn].equals("X")){
						q.add(new Point(xn, yn));
						vis[xn][yn] = true;
						dis[xn][yn] = dis[n.x][n.y] + 1;
					}
				}
			}
			if(vis[wash.x][wash.y] && dis[wash.x][wash.y] < 60){
				System.out.println(dis[wash.x][wash.y]);
			}else{
				System.out.println("#notworth");
			}
		}

	}
	static class Point{
		int x, y;
		Point(int x0, int y0){x=x0; y=y0;}
	}

}
