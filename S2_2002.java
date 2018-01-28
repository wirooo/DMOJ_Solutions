package march_3_2017;

import java.util.Scanner;

public class S2_2002 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int dem = in.nextInt();
		if(num%dem==0)System.out.println(num/dem);
		else{
			int wholenum = 0;
			int numtemp = num;
			while(numtemp>dem){
				numtemp -= dem;
				wholenum++;
			}
			int gcd = gcd(numtemp, dem);
			int newnum = numtemp/gcd;
			int newdem = dem/gcd;
			if(wholenum!=0)System.out.print(wholenum + " ");
			System.out.print(newnum + "/" + newdem);
		}

	}
	static int gcd(int a, int b){
	  if(a == 0 || b == 0) return a+b; 
	  return gcd(b,a%b);
	}

}
