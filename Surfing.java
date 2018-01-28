package december_17_2016;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Surfing {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] sitelist = new String[n];
		List text = new ArrayList();
		String[][] links = new String[n][n];
		for(int i=0; i<n; i++){
			sitelist[i]=s.nextLine();
			boolean flg = true;
			while(flg=true){
				String st = s.nextLine();
				if(st.equals("</HTML>")){
					flg=false;
				}else{
					if(st.contains("HREF")){
						int count=0;
						while(!links[i][count].equals(null)){
							count+=1;
						}
						if(links[i][count].equals(null)){
							Pattern findUrl = Pattern.compile("\\bhttp.*?\\\"\\b");
							Matcher matcher = findUrl.matcher(st);
							while(matcher.find()){
								links[i][count]=matcher.group();
							}
						}
					}
				}
			}
		}
	}

}
