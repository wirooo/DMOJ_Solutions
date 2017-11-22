package DMOJPractice.DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_11_S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        char[] a = new char[n];
        char[] b = new char[n];
        for(int i=0; i<n; i++){
            a[i] = stdin.readLine().charAt(0);
        }
        for(int i=0; i<n; i++){
            b[i] = stdin.readLine().charAt(0);
        }
        int num = 0;
        for(int i=0; i<n; i++) {
           if (a[i] == b[i]) num++;
        }
        System.out.println(num);
    }
}
