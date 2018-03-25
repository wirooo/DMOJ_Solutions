package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CCC_09_S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(stdin.readLine());
        int l = Integer.parseInt(stdin.readLine());
        int[] lights = new int[r];
        for(int i=0; i<r; i++){
            String[] line = stdin.readLine().split(" ");
            int temp = 0;
            for(int j=0; j<l; j++){
                temp <<= 1;
                temp += Integer.parseInt(line[j]);
            }
            lights[i] = temp;
        }


    }
}
