package DMOJ_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CCC_05_S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(stdin.readLine());
        for(int i=0; i<t; i++){
            String s = stdin.readLine();
            ArrayList<Character> string = new ArrayList();
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) != '-') string.add(s.charAt(j));
            }
            ArrayList result = new ArrayList();
            for(int j=0; j<10; j++){
                    if (Character.isLetter(string.get(j))) {
                        switch (s.charAt(j)) {
                            case 'A':
                            case 'B':
                            case 'C':
                                result.add('2');
                                break;
                            case 'D':
                            case 'E':
                            case 'F':
                                result.add('3');
                                break;
                            case 'G':
                            case 'H':
                            case 'I':
                                result.add('4');
                                break;
                            case 'J':
                            case 'K':
                            case 'L':
                                result.add('5');
                                break;
                            case 'M':
                            case 'N':
                            case 'O':
                                result.add('6');
                                break;
                            case 'P':
                            case 'Q':
                            case 'R':
                            case 'S':
                                result.add('7');
                                break;
                            case 'T':
                            case 'U':
                            case 'V':
                                result.add('8');
                                break;
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                                result.add('9');
                        }
                    } else if (Character.isDigit(string.get(j))) {
                        result.add(s.charAt(j));
                    }
                }
            for(int j=0; j<result.size(); j++){
                if(j == 3 || j == 7){
                    System.out.print('-');
                }
                System.out.print(result.get(j));
            }
            System.out.println();
            }
        }
    }

