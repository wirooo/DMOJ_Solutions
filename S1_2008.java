package ccc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class S1_2008 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flg = true;
		HashMap<Integer, String> map = new HashMap();
		ArrayList<Integer> list = new ArrayList();
		while(flg){
			String s = in.next();
			int x = in.nextInt();
			if(s.equals("Waterloo"))flg=false;
			map.put(x, s);
			list.add(x);
		}
		list.sort(null);
		System.out.println(map.get(list.get(0)));
		
	}

}
