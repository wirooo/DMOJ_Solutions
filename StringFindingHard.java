package DMOJPractice.DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFindingHard {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        char[] s = stdin.readLine().toCharArray();
        char[] w = stdin.readLine().toCharArray();
        System.out.println(kmp(s,w));
    }
    public static int kmp(char[] s, char[] w){
        int i = 0;
        int j = 0;
        int[] t = new int[w.length+1];
        table(w, t);
        while (i+j < s.length){
            if(w[j] == s[i+j]){
                j++;
                if(j==w.length){
                    return i;
                }
            }else{
                if(t[j]>-1){
                    i = i+j-t[j];
                    j = t[j];
                }else{
                    i=i+j+1;
                    j=0;
                }
            }
        }
        return -1;
    }
    public static void table(char[] w, int[] t){
        int pos = 1;
        int c = 0;
        t[0] = -1;
        while(pos<w.length){
            if(w[pos] == w[c]){
                t[pos] = t[c];
                pos++;
                c++;
            }else{
                t[pos] = c;
                c = t[c];
                while(c>=0 && w[pos]!=w[c]){
                    c = t[c];
                }
                pos++;
                c++;
            }
        }
        t[pos] = c;
    }
}
