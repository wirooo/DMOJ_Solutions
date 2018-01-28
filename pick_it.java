package october_8_2016;

import java.util.Arrays;
import java.util.Scanner;

public class pick_it {
	static int N;
	static int[][] table;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		table = new int[205][205];
		while(true){
			N = s.nextInt();
			if(N==0) break;
			for(int i=0; i<205; i++){
				Arrays.fill(table[i], -1);
			}
			int[] a = new int[N+1];
			for(int i=1; i<=N; i++){
				a[i] = s.nextInt();
			}
			System.out.println(fun(a, 1, N));
		}
	}
	public static int fun(int[] a, int l, int r){
		if(table[l][r]!=-1){
			return table[l][r];
		}
		if(l+1==r){
			return table[l][r] = 0;
		}
		for(int mid=l+1; mid<r; mid++){
			table[l][r] = Math.max(table[l][r], fun(a, l, mid)+fun(a, mid, r)+a[l]+a[mid]+a[r]);
		}
		return table[l][r];
	}
}