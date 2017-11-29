package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewStudents {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(stdin.readLine());
        double[] a = new double[100001];
        for(int j=1; j<=i; j++){
            a[j] = a[j-1] + Double.parseDouble(stdin.readLine());
        }
        int s = Integer.parseInt(stdin.readLine());
        for(int j=i+1; j<=i+s; j++){
            a[j] = a[j-1] + Double.parseDouble(stdin.readLine());
            String[] x = Double.toString(a[j]/j).split("\\.");
            System.out.print(x[0]+".");
            if(x[1].length()>=3)for(int k=0; k<3; k++) System.out.print(x[1].charAt(k));
            else{
                for(int k=0; k<x[1].length(); k++){
                    System.out.print(x[1].charAt(k));
                }
                for(int k=0; k<3-x[1].length(); k++){
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
