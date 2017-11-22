package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AirTravelPlanning {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++){
            HashMap<String, List<String>> flights = new HashMap<>();
            List<String> all = new ArrayList<>();
            int n = Integer.parseInt(stdin.readLine());
            for(int j=0; j<n; j++){
                String[] tokens = stdin.readLine().split(" ");
                String start = tokens[0];
                String end = tokens[1];
                String cost = tokens[2];
                all.add(start);
                all.add(end);
                if(flights.containsKey(start)) flights.get(start).add(end+"."+cost);
                else{
                    flights.put(start, new ArrayList<>());
                    flights.get(start).add(end+"."+cost);
                }
            }
            System.out.println(dijkstra(flights, "YYZ", "SEA", all));
        }

    }
    public static int dijkstra(HashMap<String, List<String>> flights, String start, String end, List<String> all){
        HashMap<String, Integer> distFromStart = new HashMap<>();
        for(String s : all){
            distFromStart.put(s, Integer.MAX_VALUE);
        }
        Queue<String> q = new LinkedList<>();
        q.add(start);
        distFromStart.put(start, 0);
        while(!q.isEmpty()){
            String current = q.poll();
                if(flights.get(current) != null) {
                    for (String s : flights.get(current)) {
                        String[] full = s.split("\\.");
                        String neighbour = full[0];
                        int cost = Integer.parseInt(full[1]);
                        int alternatePath = distFromStart.get(current) + cost;
                        if (!distFromStart.keySet().contains(neighbour) || alternatePath < distFromStart.get(neighbour)) {
                            //System.out.println(neighbour + " " + alternatePath);
                            distFromStart.put(neighbour, alternatePath);
                            q.add(neighbour);
                        }
                    }
                }
        }
        /*for(String s : distFromStart.keySet()){
            System.out.println("dist " + s + " " + distFromStart.get(s));
        }*/
        return distFromStart.get(end);
    }
}
