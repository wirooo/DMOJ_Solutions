package DMOJ_Solutions;
//1 second is 500 million - 1 billion operations
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

public class Jayden_Studies_Trees {
    static ArrayList<Integer> adj[];
    static int dist[], visited[], end, i;
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdin.readLine());
        adj = new ArrayList[N+1];
        visited = new int[N+1];
        dist = new int[N+1];
        for(int i=0; i<=N; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i=0; i<N-1; i++) {
            String[] line = stdin.readLine().split(" ");
            int x = Integer.parseInt(line[0]), y = Integer.parseInt(line[1]);
            adj[x].add(y); adj[y].add(x);
        }
        dfs(1, -1);
        dist[end] = 0;
        i=0;
        dfs(end, -1);
        int ans = 0;
        for(int x : dist)ans = Math.max(x, ans);
        System.out.println(ans);
    }
    public static void dfs(int v, int par){
        if(dist[v] > i){
            i = dist[v];
            end = v;
        }
        for(int x:adj[v]){
            if(x!=par){
                dist[x] = dist[v] + 1;
                dfs(x, v);
            }
        }
    }
}

