package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_98_S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        for(int i=0; i<n; i++){
            String[] line = stdin.readLine().split(" ");
            for(String s:line){
                if(s.length()==4)System.out.print("**** ");
                else{
                    for(char c:s.toCharArray()){
                        System.out.print(c);
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
