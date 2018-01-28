package march_25_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Sandwich {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		Deque<Integer> d = new LinkedList();
		char[] line = in.readLine().toCharArray();
		for(int i=0; i<line.length; i++){
			if(line[i]=='0')d.addLast(i+1);
			else d.addFirst(i+1);
		}
		for(int i=0; i<n; i++){
			System.out.println(d.pollFirst());
		}
	}

}
