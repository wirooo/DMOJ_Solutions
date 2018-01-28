package march_11_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n ;i++){
			int x = in.nextInt();
			char[] code = Integer.toBinaryString(x).toCharArray();
			int count=0;
			ArrayList<String> newcode = new ArrayList();
			for(int j=code.length-1; j>=0; j--){
				if(count%4==0&&count!=0){
					newcode.add(" ");
				}
				newcode.add(Character.toString(code[j]));
				count++;
			}
			Collections.reverse(newcode);
			int s = 0;
			for(String c:newcode)if(!c.equals(" "))s++;
			if(s%4==0)s=4;
			else s=s%4;
			for(int j=0; j<4-s; j++)System.out.print(0);
			for(String c:newcode)System.out.print(c);
			System.out.println();
		}
	}

}
