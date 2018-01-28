package ccc;

import java.util.Scanner;

public class RabbitGirls {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		//find extra
		//determine if adding or subtracting is faster
		//add/subtract until even.
		int xtra = N%K;
		int count = 0;
		//closer to newgroup
		if(K-xtra<xtra){
			while(xtra<K){
				count+=1;
				xtra+=1;
			}
		}else{
			while(xtra>0){
				count+=1;
				xtra-=1;
			}
		}
		System.out.println(count+1);
	}

}
