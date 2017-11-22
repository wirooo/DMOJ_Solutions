package DMOJPractice.DMOJ_Solutions;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class CCC_11_S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        int t = 0;
        int s = 0;
        for(int i=0; i<n; i++){
            String line = stdin.readLine();
            for(int j=0; j<line.length(); j++){
                if(line.charAt(j) == 't' || line.charAt(j) == 'T') t++;
                if(line.charAt(j) == 's' || line.charAt(j) == 'S') s++;
            }
        }
        if(t > s) System.out.println("English");
        else System.out.println("French");
    }
}
