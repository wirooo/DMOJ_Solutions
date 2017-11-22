package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CCC_97_S4 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(stdin.readLine());
        for(int i=0; i<t; i++){
            String s = stdin.readLine();
            List<String> h = new ArrayList<>();
            while(!s.equals("")){
                String[] tok = s.split(" ");
                for(String st : tok){
                    if(h.contains(st)) System.out.print((h.indexOf(st)+1)+" ");
                    else{
                        h.add(st);
                        System.out.print(st+" ");
                    }
                }
                System.out.println();
                s = stdin.readLine();
            }
        }
    }
}
