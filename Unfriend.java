package november_12_2016;

import java.util.Scanner;

public class Unfriend {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ary ={0,1,1,1,1,1,1};
		for(int i=1; i<n; i++){
			int x = s.nextInt();
			ary[x] = ary[x] * (ary[i]+1);
		}
		System.out.println(ary[n]);
	}

}
