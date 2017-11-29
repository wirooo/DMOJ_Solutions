package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MrNandPresents {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(stdin.readLine());
        ArrayList<Integer> head = new ArrayList<>();//head is at .get(.size)
        ArrayList<Integer> tail = new ArrayList<>();//tail is at .get(.size)
        for(int i=0; i<q; i++){
            String[] s = stdin.readLine().split(" ");
            String a = s[0];
            int n = Integer.parseInt(s[1]);
            if(a.equals("F")){
                head.add(n);
            }else if(a.equals("E")){
                tail.add(n);
            }else{
                head.remove(new Integer(n));
                tail.remove(new Integer(n));
            }
        }
        for(int i=head.size()-1; i>=0; i--) System.out.println(head.get(i));
        for(int i=0; i<tail.size(); i++) System.out.println(tail.get(i));
    }
}
