package march_3_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class S2_1997 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i=0; i<x; i++){
			int n = in.nextInt();
			ArrayList<Integer> factors = new ArrayList<Integer>();	
			int[] occurences = new int[16000];
			for(int j=1; j<=n; j++){
				if(n%j==0)factors.add(j);
			}
			for(int j=0, r=factors.get(factors.size()-1); j<r; j++, r--){
				occurences[factors.get(j)+factors.get(r)]++;
				System.out.println(j + " " + r);
			}
			boolean nasty = false;
			for(int j=0; j<occurences.length; j++){
				if(occurences[j]>1)nasty = true;
				//if(occurences[j]!=0)System.out.println(j + " " + occurences[j]);
			}
			if(nasty)System.out.println(n + " is nasty");
			else System.out.println( n + " is not nasty");
		}

	}

}
