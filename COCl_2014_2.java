package march_11_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class COCl_2014_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		HashMap<String, Integer> directory = new HashMap();
		int count =0;
		for(int i=0; i<(n*2)-1; i++){
			String s = in.readLine();
			if(!directory.containsKey(s))directory.put(s, 1);
			else directory.put(s, directory.get(s)+1);
		}
		for(String s:directory.keySet()){
			if(directory.get(s)%2==1)System.out.println(s);
		}

	}

}
