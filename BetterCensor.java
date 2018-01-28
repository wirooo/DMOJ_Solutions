package march_25_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BetterCensor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i=0; i<n; i++){
			char[] line = in.readLine().toCharArray();
			boolean checkafter, checkbefore;
			for(int j=0; j<=line.length-4; j++){
				if(j == line.length-4)checkafter = true;
				else checkafter = !Character.isLetterOrDigit(line[j+4]);
				if(j==0)checkbefore=true;
				else checkbefore = !Character.isLetterOrDigit(line[j-1]);
				if(Character.isLetterOrDigit(line[j])&&Character.isLetterOrDigit(line[j+1])&&Character.isLetterOrDigit(line[j+2])
						&&Character.isLetterOrDigit(line[j+3])&&checkafter&&checkbefore){
					line[j]='*';
					line[j+1]='*';
					line[j+2]='*';
					line[j+3]='*';
				}
			}
			for(char c:line)System.out.print(c);
			System.out.println();
		}

	}

}
