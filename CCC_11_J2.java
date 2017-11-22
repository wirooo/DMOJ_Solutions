
package DMOJPractice.DMOJ_Solutions;

        import java.util.Scanner;

public class CCC_11_J2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int h = stdin.nextInt();
        int m = stdin.nextInt();
        int hour = 0;
        boolean ans = false;
        for(int i=1; i<m; i++){
            if(((-6*Math.pow(i, 4)) + (h*Math.pow(i, 3)) + (2*Math.pow(i, 2)) + i) < 0){
                ans = true;
                if(hour == 0) hour = i;
            }
        }
        if (ans) System.out.println("The balloon first touches ground at hour: \n" + hour);
        else System.out.println("The balloon does not touch ground in the given time. ");
    }
}
