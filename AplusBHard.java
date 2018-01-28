package ccc;

import java.math.BigInteger;
import java.util.Scanner;

public class AplusBHard {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for(int i=0; i<N; i++){
			BigInteger a = s.nextBigInteger();
			BigInteger b = s.nextBigInteger();
			System.out.println(a.add(b));
		}
	}

}
