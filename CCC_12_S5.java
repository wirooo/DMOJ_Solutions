package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_12_S5 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] one = stdin.readLine().split(" ");
        int r = Integer.parseInt(one[0]);
        int c = Integer.parseInt(one[1]);
        int k = Integer.parseInt(stdin.readLine());
        int[][] map = new int[r+1][c+1];
        //int[][] cat = new int[r+1][c+1];
        for(int i=0; i<k; i++){
            String[] in = stdin.readLine().split(" ");
            map[Integer.parseInt(in[0])][Integer.parseInt(in[1])] = -1;
        }
        System.out.println(map[1][1] = paths(map, 1, 1, r, c));
/*
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
*/
    }
    public static int paths(int[][] map, int xc, int yc, int xt, int yt){
        if(map[xc][yc]==-1) return 0;
        if(xc==xt-1 && yc==yt) return map[xc][yc] = 1;
        if(xc==xt && yc==yt-1) return map[xc][yc] = 1;
        if(map[xc][yc]!=0) return map[xc][yc];
        if(xc<xt && yc<yt) return map[xc][yc] = paths(map, xc+1, yc, xt, yt) + paths(map, xc, yc+1, xt, yt);
        if(xc>=xt && yc<yt) return map[xc][yc] = paths(map, xc, yc+1, xt, yt);
        return map[xc][yc] = paths(map, xc+1, yc, xt, yt);
    }
}
