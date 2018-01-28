package february_18_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class J3_2016 {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		char[] word = r.readLine().toCharArray();
		int best = 1;
		for(int i=0; i<word.length; i++){
			for(int j=i+1; j<=word.length; j++){
				char[] fwd = Arrays.copyOfRange(word, i, j);
				char[] bck = Arrays.copyOfRange(word, i, j);
				Collections.reverse(Arrays.asList(bck));
				for(int t = 0; t < bck.length / 2; t++){
				    char temp = bck[t];
				    bck[t] = bck[bck.length - t - 1];
				    bck[bck.length - t - 1] = temp;
				}
				if(Arrays.equals(fwd, bck)&&fwd.length>best) best = fwd.length;
			}
		}
		System.out.println(best);
	}

}
