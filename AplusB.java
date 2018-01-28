package october_15_2016;

import java.util.Scanner;

public class AplusB {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0; i<n; i++){
			long a = s.nextInt();
			long b = s.nextInt();
			System.out.println(a+b);
		}
	}
}
