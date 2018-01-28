package march_3_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class COCl_2_2014 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(in.readLine());
		HashMap<String, Integer> map = new HashMap();
		String[] racers = new String[x];
		for(int i=0; i<x; i++){
			String s = in.readLine(); 
			racers[i] = s;
			map.put(s, i);
		}
		for(int i=0; i<x-1; i++){
			String s = in.readLine();
			int index = map.get(s);
			racers[index] = "useless";
		}
		for(String s:racers)if(!s.equals("useless"))System.out.println(s);
	}
}