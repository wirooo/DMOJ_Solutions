package march_25_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encoding {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = - Integer.parseInt(in.readLine());
		char[] line = in.readLine().toCharArray();
		for(int i=0; i<line.length; i++){
			if(Character.isUpperCase(line[i])){
				line[i] = (char) ((line[i] + n - (int)'A') % 26 + (int)'A');
			}else if(Character.isLowerCase(line[i])){
				line[i] = (char) ((line[i] + n - (int)'a') % 26 + (int)'a');
			}
		}
		for(char c:line)System.out.print(c);

	}

}
