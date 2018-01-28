package february_18_2017;

import java.util.Scanner;

public class J2_2016 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] square = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				square[j][i] = s.nextInt();
			}
		}
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0)
					sum1 += square[i][j];
				else if (i == 1)
					sum2 += square[i][j];
				else if (i == 2)
					sum3 += square[i][j];
				else if (i == 3)
					sum4 += square[i][j];
			}
		}
		int sum5=0;
		int sum6=0;
		int sum7=0;
		int sum8=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0)
					sum5 += square[j][i];
				else if (i == 1)
					sum6 += square[j][i];
				else if (i == 2)
					sum7 += square[j][i];
				else if (i == 3)
					sum8 += square[j][i];
			}
		}
		if(sum1==sum2&&sum2==sum3&&sum3==sum4&&sum4==sum5&&sum5==sum6&&sum6==sum7&&sum7==sum8)System.out.println("magic");
		else System.out.println("not magic");
	}

}
