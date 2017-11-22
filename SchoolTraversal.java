package DMOJPractice.DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class SchoolTraversal {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        int[][] hallways = new int[n+1][n+1];

        for(int i=0; i<n-1; i++){
            String[] hallTokens = stdin.readLine().split(" ");
            hallways[Integer.parseInt(hallTokens[0])][Integer.parseInt(hallTokens[1])] = Integer.parseInt(hallTokens[2]);
            hallways[Integer.parseInt(hallTokens[1])][Integer.parseInt(hallTokens[0])] = Integer.parseInt(hallTokens[2]);
        }
        int q = Integer.parseInt(stdin.readLine());
        for(int i=0; i<q; i++){
            String[] queryTokens = stdin.readLine().split(" ");
            int start = Integer.parseInt(queryTokens[0]);
            int end = Integer.parseInt(queryTokens[1]);
            int[] distFromStart = new int[n+1];
            for(int j=0; j<distFromStart.length; j++) distFromStart[j] = 999999999;
            distFromStart[start] = 0;
            Queue<Integer> toVisit = new LinkedList<>();

            /*for(int j=0; j<hallways.length; j++){
                if(hallways[start][j] != 999999999){
                    toVisit.add(j);
                }
            }*/
            toVisit.add(start);

            while(!toVisit.isEmpty()){
                int currentNode = toVisit.poll();
                for(int neighbourNode = 0; neighbourNode<hallways.length; neighbourNode++){
                    if(hallways[neighbourNode][currentNode] != 0){ //nodes are connected
                        int edgelen = hallways[neighbourNode][currentNode];
                        /*System.out.println(neighbourNode + " " + currentNode);
                        System.out.println(edgelen);*/
                        int totallen = edgelen + distFromStart[currentNode];
                        //System.out.println("totallen  " + totallen);
                        if(totallen < distFromStart[neighbourNode]){
                            //System.out.println(neighbourNode + " changed to " + totallen);
                            distFromStart[neighbourNode] = totallen;
                            toVisit.add(neighbourNode);
                        }
                    }
                }
            }
            System.out.println(distFromStart[end]);
        }


    }
}