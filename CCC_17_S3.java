package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_17_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        int[] wood = new int[2001];
        int[] boards = new int[4002];
        int h = 0;
        int l = 0;
        String[] s = stdin.readLine().split(" " );
        for(int i=0; i<n; i++){
            wood[Integer.parseInt(s[i])]++;
        }
        for(int i=0; i<wood.length; i++){
            if(wood[i]!=0){
                for(int j=i; j<wood.length; j++){
                    if(i==j) boards[i+j] += wood[i]/2;
                    else boards[i+j] += Math.min(wood[i], wood[j]);
                }
            }
        }
        for(int i=0; i<boards.length; i++){
            if(boards[i]>h){
                h = boards[i];
                l = 1;
            }else if(boards[i]==h) l++;
        }
        System.out.println(h + " " + l);
    }
}
