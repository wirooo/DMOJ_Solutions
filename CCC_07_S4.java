package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC_07_S4 {
    static int[] paths;
    static List<Pair<Integer, Integer>> adjlist;
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        adjlist = new ArrayList();
        String[] s = stdin.readLine().split(" ");
        while(!s[0].equals("0") && !s[1].equals("0")){
            adjlist.add(new Pair<>(Integer.parseInt(s[0]),Integer.parseInt(s[1])));
        }
        paths = new int[n+1];
        System.out.print(paths[n]=dfs(n));
    }
    public static int dfs(int n){
        Stack<Integer> s = new Stack();
        s.push(n);
        while(!s.isEmpty()){
            int curr = s.pop();
            for(Pair z:adjlist){
                if(z.y==curr){

                }
            }
        }
    }
}
class Pair<X, Y>{
    public X x;
    public Y y;
    public Pair(X x, Y y){
        this.x = x;
        this.y = y;
    }
}