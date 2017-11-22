package DMOJPractice.DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PathtoWaterloo {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] a = stdin.readLine().split(" ");
        int n = Integer.parseInt(a[0]);
        int t = Integer.parseInt(a[1]);
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        HashMap<String, Integer> distanceFromHome = new HashMap<>();
        map.put("home", new ArrayList<>());
        map.put("Waterloo GO", new ArrayList<>());
        distanceFromHome.put("Waterloo GO", Integer.MAX_VALUE);
        for(int i=0; i<n; i++){
            String station = stdin.readLine();
            map.put(station, new ArrayList<String>());
            distanceFromHome.put(station, Integer.MAX_VALUE);
        }
        for(int i=0; i<t; i++){
            String[] tokens = stdin.readLine().split("-");
            map.get(tokens[0]).add(tokens[1]);
            map.get(tokens[1]).add(tokens[0]);
        }
        Queue<String> q = new ArrayDeque<>();
        distanceFromHome.put("home", 0);
        ArrayList<String> visited = new ArrayList<>();
        q.add("home");
        while(!q.isEmpty()){
            String current = q.poll();
            visited.add(current);
            for(String s : map.get(current)){ //for each neighbouring stop
                if(!visited.contains(s)){
                    if(distanceFromHome.get(s)>distanceFromHome.get(current)+1){
                        distanceFromHome.put(s, distanceFromHome.get(current)+1);
                        q.add(s);
                    }
                }
            }
        }
        if(distanceFromHome.get("Waterloo GO") != Integer.MAX_VALUE){
            System.out.println(distanceFromHome.get("Waterloo GO"));
        }else{
            System.out.println("RIP ACE");
        }
    }
}
