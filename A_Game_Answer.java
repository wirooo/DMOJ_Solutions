package october_1_2016;

import java.util.Scanner;

public class A_Game_Answer {
	static int[][] table = new int[1001][1001];
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] coins = new int[N+1];
		int[] sum = new int[N+1];
		for(int i=1; i<=N; i++){
			coins[i] = s.nextInt();
			sum[i] = sum[i-1]+coins[i];
		}
		System.out.println(calc(sum, 1, N));
	}
	public static int calc(int[] sum, int l, int r){
		if(l>r){
			return 0;
		}
		if(table[l][r]!=0){
			return table[l][r];
		}
		int s = sum[r]-sum[l-1];
		return table[l][r] = Math.max(s - calc(sum, l, r-1), s-calc(sum, l+1, r));
	}
}
