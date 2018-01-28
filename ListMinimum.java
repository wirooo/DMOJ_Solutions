package november_12_2016;

import java.util.Arrays;
import java.util.Scanner;

public class ListMinimum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ary = new int[n];
		for(int i=0; i<n; i++){
			ary[i]=s.nextInt();
		}
		Arrays.sort(ary);
		for(int y=0; y<n; y++){
			System.out.println(ary[y]);
		}

	}

}
