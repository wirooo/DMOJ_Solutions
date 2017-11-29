package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marathon {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] one = stdin.readLine().split(" ");
        int n = Integer.parseInt(one[0]);
        int q = Integer.parseInt(one[1]);
        String[] two = stdin.readLine().split(" ");
        int[] a = new int[5000001];
        for(int i=1; i<=n; i++){
            a[i] =a[i-1] + Integer.parseInt(two[i-1]);
        }
        int s = a[n];
        for(int i=0; i<q; i++) {
            String[] thr = stdin.readLine().split(" ");
            int l = Integer.parseInt(thr[0]);
            int r = Integer.parseInt(thr[1]);
            System.out.println(s - (a[r] - a[l - 1]));
        }
    }
}
