package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC_09_J5 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int[][] map = new int[51][51];
        map[1][6] = 1;
        map[2][6] = 1;
        map[3][6] = 1;
        map[3][4] = 1;
        map[3][5] = 1;
        map[3][15] = 1;
        map[4][6] = 1;
        map[4][3] = 1;
        map[4][5] = 1;
        map[5][6] = 1;
        map[5][4] = 1;
        map[5][3] = 1;
        map[6][1] = 1;
        map[6][2] = 1;
        map[6][3] = 1;
        map[6][4] = 1;
        map[6][5] = 1;
        map[6][7] = 1;
        map[7][6] = 1;
        map[7][8] = 1;
        map[8][7] = 1;
        map[8][9] = 1;
        map[9][10] = 1;
        map[9][8] = 1;
        map[9][12] = 1;
        map[10][9] = 1;
        map[10][11] = 1;
        map[11][10] = 1;
        map[11][12] = 1;
        map[12][9] = 1;
        map[12][11] = 1;
        map[12][13] = 1;
        map[13][12] = 1;
        map[13][14] = 1;
        map[13][15] = 1;
        map[14][13] = 1;
        map[15][13] = 1;
        map[15][3] = 1;
        map[16][17] = 1;
        map[16][18] = 1;
        map[17][16] = 1;
        map[17][18] = 1;
        map[18][16] = 1;
        map[18][17] = 1;
        String s = stdin.readLine();
        while(!s.equals("q")){
            if(s.equals("i")){ //make x and y friends
                int x = Integer.parseInt(stdin.readLine());
                int y = Integer.parseInt(stdin.readLine());
                map[x][y] = 1;
                map[y][x] = 1;
            }else if (s.equals("d")){ //delete x and y friendship
                int x = Integer.parseInt(stdin.readLine());
                int y = Integer.parseInt(stdin.readLine());
                map[x][y] = 0;
                map[y][x] = 0;
            }else if (s.equals("n")){ //output # of friends
                int x = Integer.parseInt(stdin.readLine());
                int c = 0;
                for(int i=1; i<map.length; i++){
                    if(map[x][i]!=0) c++;
                }
                System.out.println(c);
            }else if(s.equals("f")){ //outputs friends of friends
                int x = Integer.parseInt(stdin.readLine());
                Set<Integer> a = new HashSet<>();
                Set<Integer> b = new HashSet<>();
                a.add(x);
                for(int i=1; i<map.length; i++){
                    if(map[x][i]!=0){
                        a.add(i);
                        for(int j=1; j<map.length; j++){
                            if(map[i][j]!=0){
                                b.add(j);
                            }
                        }
                    }
                }
                int c = 0;
                for(int n : b){
                    if(!a.contains(n)){
                        c++;
                    }
                }
                System.out.println(c);
            }else if(s.equals("s")){
                int x = Integer.parseInt(stdin.readLine());
                int y = Integer.parseInt(stdin.readLine());
                int n = separation(map, x, y);
                if(n==-1) System.out.println("Not connected");
                else System.out.println(n);
            }


            s = stdin.readLine();
        }
    }
    public static int separation(int[][] map, int x, int y){
        Queue<Integer> q = new ArrayDeque<>();
        int[] dist = new int[51];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[x] = 0;
        q.add(x);

        while(!q.isEmpty()){
            int c = q.poll();
            for(int i=0; i<map.length; i++){
                if(map[c][i]!=0){
                    if(dist[c]+1<dist[i]){
                        dist[i]=dist[c]+1;
                        q.add(i);
                    }
                }
            }
        }
        if(dist[y] >= 500) return -1;
        else return dist[y];
    }
}
