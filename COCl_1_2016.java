package march_3_2017;

import java.util.Scanner;

public class COCl_1_2016 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n = in.nextInt();
		int mleft = 0;
		for(int i=0; i<n; i++){
			mleft += x;
			int p = in.nextInt();
			mleft -= p;
		}
		System.out.println(mleft+x);

	}

}
