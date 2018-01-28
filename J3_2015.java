package february_18_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class J3_2015 {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		char[] word = r.readLine().toCharArray();
		ArrayList<Character> newword = new ArrayList<Character>();
		for(char c:word){
			newword.add(c);
			if(Character.toString(c).matches("[^aeiou]")){
				if(c<='c')newword.add('a');
				else if(c<='g')newword.add('e');
				else if(c<='l')newword.add('i');
				else if(c<='r')newword.add('o');
				else newword.add('u');
				if(c!='z')newword.add((char) (c+1));
				else newword.add('a');
			}
			
		}
		for(char c:newword)System.out.print(c);
	}
}
