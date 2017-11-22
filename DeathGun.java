package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DeathGun {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        HashMap<String, List<String>> links = new HashMap<>();
        for(int i=0; i<n; i++){
            String[] tokens = stdin.readLine().split(" ");
            if(links.containsKey(tokens[0])) links.get(tokens[0]).add(tokens[1]);
            else{
                links.put(tokens[0], new ArrayList<>());
                links.get(tokens[0]).add(tokens[1]);
            }
        }
        boolean flg = true;
        while(flg){
            for(String s : links.keySet()){
                Deque<String> stack = new ArrayDeque<>();
                stack.push(s);
                List<String> visited = new ArrayList<>();
                List<String> path = new ArrayList<>();
                while(!stack.isEmpty()){
                    String current = stack.poll();
                    if(!visited.contains(current)){
                        visited.add(current);
                        path.add(current);
                        for(String nextNode : links.get(current)){
                            stack.push(nextNode);
                        }
                    }
                }
                if(path.size() == links.size()){
                    flg = false;
                    for(int i = 0; i<path.size(); i++){
                        System.out.println(path.get(i));
                    }
                }
            }
        }

    }
}
