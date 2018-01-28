package march_11_2017;

import java.util.Scanner;

public class S1_2003 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pos = 1;
		boolean flg=true;
		while (flg) {
			int roll = in.nextInt();
			if(pos+roll<=100)pos += roll;
			if (pos == 100) {
				System.out.println("You are now on square 100");
				System.out.println("You Win!");
				flg=false;
			} else {
				if (roll == 0) {
					System.out.println("You Quit!");
					flg=false;
				} else {
					if (pos == 54)
						pos = 19;
					else if (pos == 90)
						pos = 48;
					else if (pos == 99)
						pos = 77;
					else if (pos == 9)
						pos = 34;
					else if (pos == 40)
						pos = 64;
					else if (pos == 67)
						pos = 86;
					System.out.println("You are now on square "+pos);
				}
			}
		}

	}

}
