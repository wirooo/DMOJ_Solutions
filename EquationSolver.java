package DMOJ_Solutions;

import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        boolean flg = true;
        int count = 0;
        int sum = 0;
        boolean plus = true;
        while(flg){
            if(count%2==0){
                int n = stdin.nextInt();
                if(plus) sum += n;
                else sum -= n;
            }else{
                String s = stdin.next();
                if(s.equals("=")) flg = false;
                else{
                    if(s.equals("P")) plus = true;
                    else plus = false;
                }
            }
            count++;
        }
        System.out.println(sum);
    }
}
