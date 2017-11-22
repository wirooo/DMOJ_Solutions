package DMOJ_Solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class Sjecista {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        if(n<4) System.out.println(0);
        else System.out.println(fact(n).divide(new BigInteger("24").multiply(fact(n-4))));
    }
    public static BigInteger fact(int n){
        BigInteger x = new BigInteger("1");
        for(int i=n; i>1; i--){
            x = x.multiply(new BigInteger(Integer.toString(i)));
        }
        return x;
    }
}
