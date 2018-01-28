package may_27_2017;

import java.util.Scanner;

public class LOL {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int hi = 0,lo = 0,r = 0,l = 0;
		int Xfirst = in.nextInt();
		int Yfirst = in.nextInt();
		r=Xfirst;
		l=Xfirst;
		hi=Yfirst;
		lo=Yfirst;
		for(int i=0; i<N-1; i++){
			int X = in.nextInt();
			int Y = in.nextInt();
			if(X>r)r=X;
			if(X<l)l=X;
			if(Y>hi)hi=Y;
			if(Y<lo)lo=Y;
		}
		int length = Math.abs(r-l);
		int height = Math.abs(hi-lo);
		System.out.println(length*height);

	}

}
