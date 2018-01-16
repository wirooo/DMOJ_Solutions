package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AIFEssay {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(stdin.readLine());
        for(int i=0; i<l; i++){
            int n = Integer.parseInt(stdin.readLine());
            String[] a= stdin.readLine().split(" ");
            for(String s:a){
                boolean isUpper = true;
                boolean hasLetter = false;
                for(int j=0; j<s.length(); j++){
                    if(Character.isLetter(s.charAt(j)) && Character.isLowerCase(s.charAt(j))) isUpper = false;
                    if(Character.isLetter(s.charAt(j))) hasLetter = true;
                }
                if(isUpper && hasLetter) System.out.print("!!!");
                for(int j=0; j<s.length(); j++){
                    if(s.charAt(j) == '.') System.out.print("!!!");
                    else System.out.print(s.charAt(j));
                }
                if(isUpper && hasLetter) System.out.print("!!!");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
