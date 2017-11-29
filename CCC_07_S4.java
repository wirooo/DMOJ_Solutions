package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CCC_07_S4 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        Map<Integer, ArrayList<Integer>> m = new HashMap<>();
        String[] s = stdin.readLine().split(" ");
        while(Integer.parseInt(s[0])!=0 && Integer.parseInt(s[1])!=0){
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            if(m.keySet().contains(a)){
                m.get(a).add(b);
            }else{
                m.put(a, new ArrayList<Integer>());
                m.get(a).add(b);
            }
            s = stdin.readLine().split(" ");
        }
        if(!m.keySet().contains(1)){
            m.put(1, new ArrayList<>());
        }
        System.out.println(dfs(n, 0, 1, m));

    }
    public static int dfs(int goal, int paths, int point, Map<Integer, ArrayList<Integer>> m){
        if(point==goal){
            //System.out.println("here");
            return 1;
        }
        //System.out.println(paths);
        for(int i=0; i<m.get(point).size(); i++){
            //System.out.println(point + " " + m.get(point).get(i));
            paths += dfs(goal, paths, m.get(point).get(i), m);
        }
        return paths;
    }
}
