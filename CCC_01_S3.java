package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CCC_01_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, List<Character>> map = new HashMap();
        boolean flg = true;
        while(flg){
            String[] tokens = stdin.readLine().split("");
            if(tokens[0].equals("*") && tokens[1].equals("*")) flg = false;
            else{
                char first = tokens[0].charAt(0);
                char second = tokens[1].charAt(0);
                if(map.containsKey(first)) map.get(first).add(second);
                else{
                    map.put(first, new ArrayList<Character>());
                    map.get(first).add(second);
                }
                if(map.containsKey(second)) map.get(second).add(first);
                else{
                    map.put(second, new ArrayList<Character>());
                    map.get(second).add(first);
                }
            }
        }

        ArrayList<ArrayList<Character>> paths = new ArrayList<>();
        Deque<Character> toVisit = new ArrayDeque<>();
        toVisit.push('A');
        ArrayList<Character> visited = new ArrayList<>();
        visited.add('A');
        /*while(!toVisit.isEmpty()){
            char currentNode = toVisit.pop();
            for(char neighbourNode : map.get(currentNode)){
                if(map.get(currentNode))
                visited.add()
            }
        }*/


    }
}
