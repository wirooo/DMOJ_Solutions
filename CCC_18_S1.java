package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CCC_18_S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(stdin.readLine());
        }
        Arrays.sort(a);
        double min = 999999999.0;
        for(int i=1; i<a.length-1; i++){
            double x = ((a[i]-a[i-1])/2.0)+((a[i+1]-a[i])/2.0);
            if(x<min)min = x;
        }
        System.out.println(min);
    }
}
