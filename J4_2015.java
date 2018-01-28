package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class J4_2015 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(r.readLine());
		Map<Integer, Boolean> replied = new HashMap<Integer, Boolean>();
		Map<Integer, Integer> friends = new HashMap<Integer, Integer>();
		for (int i = 0; i < m; i++) {
			String in = r.readLine();
			String[] parts = in.split(" ");
			String cmd = parts[0];
			int num = Integer.parseInt(parts[1]);
			if (cmd.equals("R") && !friends.containsKey(num)) {
				friends.put(num, 0);
				replied.put(num, false);
			} else {
				if (cmd.equals("R")) {
					replied.put(num, false);
				} else {
					if (cmd.equals("S")) {
						replied.put(num, true);
					} else {
						if (cmd.equals("W")) {
							for (Map.Entry<Integer, Boolean> entry : replied.entrySet()) {
								if (entry.getValue() == false) {
									friends.put(entry.getKey(), friends.get(entry.getKey()) + num-1);

								}
							}
						}
					}

				}
			}
			if (!cmd.equals("W")) {
				for (Map.Entry<Integer, Boolean> entry : replied.entrySet()) {
					if (entry.getValue() == false) {
						friends.put(entry.getKey(), friends.get(entry.getKey()) + 1);
					}

				}
			}
		}
		Integer[] friendarry = new Integer[friends.size()];
		Integer[] results = new Integer[friends.size()];
		int counter = 0;
		for (Map.Entry<Integer, Integer> entry : friends.entrySet()) {
			friendarry[counter] = entry.getKey();
			counter += 1;
		}
		Arrays.sort(friendarry);
		for (Map.Entry<Integer, Integer> entry : friends.entrySet()) {
			int waittime = 0;
			if (replied.get(entry.getKey()) == false) {
				waittime = -1;
			} else {
				waittime = entry.getValue();
			}
			results[Arrays.asList(friendarry).indexOf(entry.getKey())] = waittime;
		}
		for (int i = 0; i < friendarry.length; i++) {
			System.out.println(friendarry[i] + " " + results[i]);
		}
	}

}
