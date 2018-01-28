package february_25_2017_CCC17Takeup;

import java.util.Scanner;

public class S3_2017 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//freq[] = how many pieces of wood have height = indices of array
		//sums[] = frequency of pairs of wood (i.e. heights of potential blocks)
		//take minimum between numbers added from freq to sums unless it is the same (i.e. 2+2 or 3+3) 
		//    where it is instead frequency / 2.
		//loop through to find maximum and the amount of times it happens.
		int n = in.nextInt(); int max = 0; int ways = 0; 
		int[] freq = new int[2001];
		for(int i=0; i<n; i++){
			int x = in.nextInt();
			freq[x]++;
		}
		int[] sums = new int[4001];
		for(int i=2; i<4000; i++){
			for(int j=1; j<=i-1; j++){
				sums[i] = Math.min(freq[j], freq[i-j]);
			}
		}
		System.out.println(sums);

	}

}
