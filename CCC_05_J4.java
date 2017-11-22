package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_05_J4 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(stdin.readLine());
        int h = Integer.parseInt(stdin.readLine());
        int cw = Integer.parseInt(stdin.readLine());
        int ch = Integer.parseInt(stdin.readLine());
        int s = Integer.parseInt(stdin.readLine());
        int[][] map = new int[h+1][w+1];
        for(int i=1; i<=h; i++){
            for(int j=1; j<=w; j++){
                if((i<=ch)){
                    if(j<=cw || j>w-cw) map[i][j] = 1;
                }else if (i>h-ch){
                    if(j<=cw || j>w-cw) map[i][j] = 1;
                }
            }
        }
        /*for(int i=1; i<=h; i++){
            for(int j=1; j<=w; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }*/
        int[] ans = func(cw+1, 1, map, s, 0);
        System.out.println(ans[0] + "\n" + ans[1]);
        /*for(int i=1; i<=h; i++){
            for(int j=1; j<=w; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }*/
    }
    public static int[] func(int c, int r, int[][] map, int s, int d){ //d: 0 = right, 1 = down, 2 = left, 3 = up
        int[] ans = new int[2];
        if(s==0){
            ans[0] = c;
            ans[1] = r;
            return ans;
        }else{
            if(d==0){//moving right
                if(r-1>=1 && map[r-1][c]==0) {//top is open
                    map[r][c] = 1;
                    return func(c, r - 1, map, s - 1, 3);
                }else if(c+1<map[0].length && map[r][c+1]==0) {//to the right is open
                    map[r][c] = 1;
                    return func(c + 1, r, map, s - 1, 0);
                }else if(r+1<map.length && map[r+1][c]==0) {//bottom is open
                    map[r][c] = 1;
                    return func(c, r + 1, map, s - 1, 1);
                }else{
                    ans[0] = c;
                    ans[1] = r;
                    return ans;
                }
            }else if(d==1){//moving down
                if(c+1<map[0].length && map[r][c+1]==0) {//to the right is open
                    map[r][c] = 1;
                    return func(c + 1, r, map, s - 1, 0);
                }else if(r+1<map.length && map[r+1][c]==0) {//bottom is open
                    map[r][c] = 1;
                    return func(c, r + 1, map, s - 1, 1);
                }else if(c-1>=1 && map[r][c-1]==0) {//left is open
                    map[r][c] = 1;
                    return func(c - 1, r, map, s - 1, 2);
                }else{
                    ans[0] = c;
                    ans[1] = r;
                    return ans;
                }
            }else if(d==2){//moving left
                if(r+1<map.length && map[r+1][c]==0) {//bottom is open
                    map[r][c] = 1;
                    return func(c, r + 1, map, s - 1, 1);
                }else if(c-1>=1 && map[r][c-1]==0) {//left is open
                    map[r][c] = 1;
                    return func(c - 1, r, map, s - 1, 2);
                }else if(r-1>=1 && map[r-1][c]==0) {//top is open
                    map[r][c] = 1;
                    return func(c, r - 1, map, s - 1, 3);
                }else{
                    ans[0] = c;
                    ans[1] = r;
                    return ans;
                }
            }else{//moving up
                if(c-1>=1 && map[r][c-1]==0) {//left is open
                    map[r][c] = 1;
                    return func(c - 1, r, map, s - 1, 2);
                }else if(r-1>=1 && map[r-1][c]==0) {//top is open
                    map[r][c] = 1;
                    return func(c, r - 1, map, s - 1, 3);
                }else if(c+1<map[0].length && map[r][c+1]==0) {//to the right is open
                    map[r][c] = 1;
                    return func(c + 1, r, map, s - 1, 0);
                }else{
                    ans[0] = c;
                    ans[1] = r;
                    return ans;
                }
            }



        }
    }
}
