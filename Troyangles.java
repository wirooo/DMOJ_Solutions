package october_29_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Troyangles {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(r.readLine());
		String[][] table = new String[N+5][N+5];
		for(int i=1; i<=N; i++){
			String x = r.readLine();
			String[] split = x.split("");
			for(int j=1; j<=split.length-1; j++){
			table[i][j] = split[j];
			} 
		}
		int dp[][] = new int[N+5][N+5];
		for(int i=N; i>0; i--){
			for(int j=N; j>0; j--){
				if(table[i][j].equals(".")){
					dp[i][j] = 0;
				}else{
					int y = 0;
					if(table[i][j].equals("#")){
						y+=1;
					}
					if(table[i][j+1].equals("#")&&table[i+1][j+1].equals("#")&&table[i-1][j+1].equals("#")){
						y+=Math.min(Math.min(dp[i][j+1], dp[i+1][j+1]), dp[i-1][j+1]);
					}
					
					dp[i][j]=y;
				}
			}
		}
		int z = 0; 
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				z+=dp[i][j];
			}
		}
		System.out.println(z);
	}
}
