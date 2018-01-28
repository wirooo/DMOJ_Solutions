package october_15_2016;

import java.util.Scanner;

public class ZenGarden {
static int[] harmony;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum=0;
		int n = s.nextInt();
		harmony = new int[n+1];
		for(int i=1; i<=n; i++){
			harmony[i] = s.nextInt();
			sum+=harmony[i];
		}
		int m = s.nextInt();
		for(int i=0; i<m; i++){
			int x=s.nextInt();
			int y=s.nextInt();
			sum -= Math.min(Math.min(harmony[x], harmony[x+1]), y);
		}
		System.out.println(sum);
	}


}
	