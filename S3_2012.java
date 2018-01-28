package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class S3_2012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		HashMap<Integer, Integer> map = new HashMap();
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(in.readLine());
			if (map.containsKey(x))
				map.put(x, map.get(x) + 1);
			else
				map.put(x, 1);
		}
		int max = 1;
		for (int x : map.keySet())
			if (map.get(x) > max)
				max = map.get(x);
		ArrayList<Integer> mostfreq = new ArrayList();
		for (int x : map.keySet()) {
			if (map.get(x) == max) {
				mostfreq.add(x);
			}
		}
		boolean second = false;
		if (mostfreq.size() < 2) {
			second = true;
			int maxtwo = 1;
			for (int y : map.keySet())
				if (map.get(y) > maxtwo && map.get(y) != max)
					maxtwo = map.get(y);
			for (int y1 : map.keySet())
				if (map.get(y1) == maxtwo)
					mostfreq.add(y1);
		}
		int maxdiff = 0;
		if (second) {
			int a = mostfreq.get(0);
			for(int i=1; i<mostfreq.size(); i++){
				if(Math.abs(a-mostfreq.get(i))>maxdiff)maxdiff=Math.abs(a-mostfreq.get(i));
			}
		} else {
			for (int i = 0; i < mostfreq.size() - 1; i++) {
				for (int j = i; j < mostfreq.size(); j++) {
					if (Math.abs(mostfreq.get(i) - mostfreq.get(j)) > maxdiff)
						maxdiff = Math.abs(mostfreq.get(i) - mostfreq.get(j));
				}
			}
		}
		System.out.println(maxdiff);

	}

}
