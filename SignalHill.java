package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SignalHill {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = stdin.readLine().split(" ");
        int b = Integer.parseInt(s1[0]);
        int q = Integer.parseInt(s1[1]);
        ArrayList<Beacon> a = new ArrayList<>();
        for(int i=0; i<b; i++){
            String[] s2 = stdin.readLine().split(" ");
            a.add(i, new Beacon(Integer.parseInt(s2[0]), Integer.parseInt(s2[1]), Integer.parseInt(s2[2])));
        }


    }
}
class Beacon{
    public int x, y, r;
    public Beacon(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
