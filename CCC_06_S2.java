package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CCC_06_S2 {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String plain = stdin.readLine();
        String cypher = stdin.readLine();
        String solve = stdin.readLine();
        Map<Character, Character> key = new HashMap();
        for(int i=0; i<cypher.length(); i++){
            key.put(cypher.charAt(i), plain.charAt(i));
        }
        for(int i=0; i<solve.length(); i++){
            if(key.containsKey(solve.charAt(i))){
                System.out.print(key.get(solve.charAt(i)));
            }else{
                System.out.print('.');
            }
        }
    }
}
