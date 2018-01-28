package february_18_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1_2016 {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int w = 0;
		int l = 0;
		for(int i=0; i<6; i++){
			String x = r.readLine();
			if(x.equals("W"))w+=1;
		}
		switch (w){
		case 1:
		case 2:
			System.out.println(3);
			break;
		case 3:
		case 4:
			System.out.println(2);
			break;
		case 5:
		case 6:
			System.out.println(1);
			break;
		default: 
			System.out.println(-1);
			break;
		}
		

	}

}
