package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_04_S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        for(int i=0; i<n; i++){
            boolean hasFix = false;
            String[] words = new String[3];
            for(int j=0; j<3; j++){
                words[j] = stdin.readLine();
            }
            for (int j=0; j<words.length; j++) {
                if(words[j] != null) {
                    for (int x = 0; x <words[j].length(); x++) {
                        for(int t = 0; t<words.length; t++){
                            if(t != j){
                                if(words[t].equals(words[j].substring(0, x)) || words[t].equals(words[j].substring(x, words[j].length()))) hasFix = true;
                            }
                        }
                    }
                }
            }

            if(hasFix) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
