package DMOJ_Solutions;

import java.util.Scanner;

public class Diamonds {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int x = -1;
        for(int i=0; i<n; i++){
            if(i==0 || i==n-1) for(int j=0; j<n; j++) System.out.print("*");
            else{
                for(int j=0; j<n; j++){
                    if(j<=n/2+x && j>=n/2-x) System.out.print(" ");
                    else System.out.print("*");
                }
            }
            if(i<n/2) x++;
            else x--;
            System.out.println();
        }
    }
}
