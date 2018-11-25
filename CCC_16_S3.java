package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//n vertices n-1 edges connected = tree
//picking any node, to visit all nodes and then come back to the original node will take 2(n-1)
//if you don't have to come back, 2(n-1) - [longest path from start]
//start from any node and minimize distance, start from endpoint of diameter, 2(n-1) - [diameter]
public class CCC_16_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    }
}
//first dfs is to prune tree - remove any parts without any pho restaurants (start at a pho node), as well as finding furthest node
//      on your way back from each dfs, check if it is a pho restaurant, if it is, then add to new adj list
//      if it isnt and its new adj list is empty, then skip it.
//second dfs finds diameter for new adj list

//topological sort
//ordering vertices in a directed, non-cyclic graph
//if there is a path from q to p, then q appears before p in the orderd sort
//topological sort sequence is not unique
//start with vertex without incoming edge
//store vertex, remove it and its edges, and then repeat
//create q with nodes that have "in-degree" (number of edges going in) = 0, all nodes w edges from that node are --, anything that goes to 0
// s placed in q again