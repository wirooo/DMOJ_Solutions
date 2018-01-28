package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J5_2005 {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		boolean condition = true;
		while(condition){
			String s = r.readLine();
			if(s.equals("X")){
				condition = false;
			}else{
				char firstletter = ' ';
				boolean answer = true;
				for(int i=0; i<s.length(); i++){
					if(i==0){
						if(s.charAt(0)!='A' && s.charAt(0)!='B'){
							answer = false;
						}else{
							if(s.charAt(0)=='A'){
								firstletter = 'A';
							}else{
								firstletter = 'B';
							}
						}
					}else{
						if(i==s.length()-1&&i!=0){
							if(firstletter =='A'&&s.charAt(i)!='A'){
								answer = false;
							}
							if(firstletter =='B'){
								if(s.charAt(i)!='S' || s.charAt(i-1)!='A'){
									answer = false;
								}
							}
						}else{
							if(i%2==1){
								if(firstletter == 'A' && s.charAt(i)!='N'){
									answer = false;
								}
								if(firstletter == 'B' && s.charAt(i)!='A'){
									answer = false;
								}
							}
							if(i%2==0){
								if(firstletter == 'A' && s.charAt(i)!='A'){
									answer = false;
								}
								if(firstletter == 'B' && s.charAt(i)!='N'){
									answer = false;
								}
							}
						}
					}
				}
				if(answer){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		}
	}

}
