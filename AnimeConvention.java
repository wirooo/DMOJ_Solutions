package DMOJPractice.DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AnimeConvention {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] firstTokens = stdin.readLine().split(" ");
        int n = Integer.parseInt(firstTokens[0]); //num of cities
        int q = Integer.parseInt(firstTokens[1]); //num of queries
        List<Integer>[] map = new List[n+1]; //adjacency list
        for(int i=1; i<map.length; i++)map[i] = new ArrayList<Integer>();
        for(int i=0; i<q; i++){
            String[] query = stdin.readLine().split(" ");
            String action = query[0];
            int firstCity = Integer.parseInt(query[1]);
            int secondCity = Integer.parseInt(query[2]);
            if(action.equals("A")){ // adding to map
                map[firstCity].add(secondCity);
                map[secondCity].add(firstCity);
            }else if (action.equals("Q")){ // check if two nodes are connected
                boolean result = BFS(map, firstCity, secondCity);
                if(result) System.out.println("Y");
                else System.out.println("N");
            }
        }

    }
    public static boolean BFS(List<Integer>[] map, int start, int end){
        Queue<Integer> toVisit = new LinkedList<>();
        toVisit.add(start);
        Set<Integer> visited = new HashSet<Integer>();
        visited.add(start);
        boolean notReachedEnd = true;
        while(!toVisit.isEmpty() && notReachedEnd){
            int currentNode = toVisit.poll();
            for(int x:map[currentNode]){
                if(x == end) {
                    notReachedEnd = false;
                } else if(!visited.contains(x)){
                    toVisit.add(x);
                    visited.add(x);
                }
            }
        }
        return !notReachedEnd;
    }
}
