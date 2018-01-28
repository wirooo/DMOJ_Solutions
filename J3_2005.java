package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class J3_2005 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean flg = true;
		ArrayList<String> directions = new ArrayList<String>();
		while (flg) {
			directions.add(in.readLine());
			String s = in.readLine();
			if (s.equals("SCHOOL")) {
				flg = false;
			} else {
				directions.add(s);
			}
		}
		for (int i = directions.size() - 1; i >= 0; i--) {
			if (i == 0) {
				if (directions.get(i).equals("R"))
					System.out.println("Turn LEFT into your HOME.");
				else
					System.out.println("Turn RIGHT into your HOME.");
			} else {
				if (i % 2 == 0) {
					// dealing with direction
					if (directions.get(i).equals("R"))System.out.print("Turn LEFT onto ");
					else System.out.print("Turn RIGHT onto ");
				} else {
					System.out.println(directions.get(i) + " street.");
				}
			}
		}
	}

}
