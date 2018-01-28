package march_3_2017;

import java.util.Arrays;
import java.util.Scanner;

public class J2_2002 {

	public static void main(String[] args) {
		String[] vowels = {"a", "e", "i", "o", "u"};
		Scanner in = new Scanner(System.in);
		boolean flg = true;
		while(flg){
			String s = in.nextLine();
			if(s.equals("quit!"))flg=false;
			else{
				char[] word = s.toCharArray();
				if(word[word.length-1]=='r'&&word[word.length-2]=='o'&&word.length>4&&!Arrays.asList(vowels).contains(Character.toString(word[word.length-3]))){
					char[] newword = new char[word.length+1];
					for(int i=0; i<word.length-1; i++){
						newword[i] = word[i];
					}
					newword[newword.length-2]='u';
					newword[newword.length-1]='r';
					for(char c:newword)System.out.print(c);
				}else for(char c:word)System.out.print(c);
			}
		System.out.println("");
		}

	}

}
