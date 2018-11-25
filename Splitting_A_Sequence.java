package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Splitting_A_Sequence {
    static int[] a;
    static int m;
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = stdin.readLine().split(" ");
        int n = Integer.parseInt(in1[0]);
        m = Integer.parseInt(in1[1]);
        String[] in2 = stdin.readLine().split(" ");
        a = new int[in2.length];
        int lo = 0;
        int hi = 0;
        for(int i=0; i<a.length; i++){
            a[i] = Integer.parseInt(in2[i]);
            lo = Math.max(a[i], lo);
            hi += a[i];
        }
        int ans = hi;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(check(mid)){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean check(int x){
        int csum = 0;
        int count = 1;
        for(int c:a){
            if(csum+c<=x){
                csum+=c;
            }else{
                count++;
                csum=c;
            }
        }
        if(count>m){
            return false;
        }
        return true;
    }
}
