package february_18_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1_2016 {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		char[] one = r.readLine().toCharArray();
		char[] two = r.readLine().toCharArray();
		for (char c : one) {
			int onecount = 0, twocount = 0;
			for (int i = 0; i < one.length; i++) {
				if (one[i] == c)
					onecount += 1;
				if (two[i] == c)
					twocount += 1;
			}
			if (onecount < twocount) {
				System.out.println("N");
				System.exit(0);
			}

		}
		System.out.println("A");
	}
}
