package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrunoandFibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        String[] s = stdin.readLine().split("");
        int x = 1;
        int y = 1;
        int z = x+y;
        boolean ans = true;
        if(!s[x-1].equals("A")) ans = false;
        if(!s[z-1].equals("A")) ans = false;
        while(y+z<=n){
            x = y;
            y = z;
            z = x + y;
            if(!s[z-1].equals("A")) ans = false;
        }
        if(ans)System.out.println("That's quite the observation!");
        else System.out.println("Bruno, GO TO SLEEP");
    }
}
