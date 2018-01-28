package march_3_2017;

import java.util.Scanner;

public class J1_2002 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n!=1&&n!=4){
			System.out.println(" * * * ");
		}
		switch(n){
		case 0:
			for(int i=0; i<3; i++)System.out.println("*     *");
			for(int i=0; i<3; i++)System.out.println("*     *");
			break;
		case 1:
			for(int i=0; i<6; i++)System.out.println("      *");
			break;
		case 2: 
			for(int i=0; i<3; i++)System.out.println("      *");
			System.out.println(" * * * ");
			for(int i=0; i<3; i++)System.out.println("*      ");
			break;
		case 3:
			for(int i=0; i<3; i++)System.out.println("      *");
			System.out.println(" * * * ");
			for(int i=0; i<3; i++)System.out.println("      *");
			break;
		case 4:
			for(int i=0; i<3; i++)System.out.println("*     *");
			System.out.println(" * * * ");
			for(int i=0; i<3; i++)System.out.println("      *");
			break;
		case 5: 
			for(int i=0; i<3; i++)System.out.println("*      ");
			System.out.println(" * * * ");
			for(int i=0; i<3; i++)System.out.println("      *");
			break;
		case 6:
			for(int i=0; i<3; i++)System.out.println("*      ");
			System.out.println(" * * * ");
			for(int i=0; i<3; i++)System.out.println("*     *");
			break;
		case 7:
			for(int i=0; i<6; i++)System.out.println("      *");
			break;
		case 8: 
			for(int i=0; i<3; i++)System.out.println("*     *");
			System.out.println(" * * * ");
			for(int i=0; i<3; i++)System.out.println("*     *");
			break;
		case 9:
			for(int i=0; i<3; i++)System.out.println("*     *");
			System.out.println(" * * * ");
			for(int i=0; i<3; i++)System.out.println("      *");
			break;
		}
		if(n!=1&&n!=4&&n!=7)System.out.println(" * * * ");
		
	}

}
