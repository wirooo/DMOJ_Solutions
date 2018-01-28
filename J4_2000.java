package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class J4_2000 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(r.readLine());
		List<Double> streams = new ArrayList<Double>();
		for(int i=0; i<n; i++){
			streams.add((double)Integer.parseInt(r.readLine()));
		}
		boolean condition = true; 
		while (condition){
			double in = (double)Integer.parseInt(r.readLine());
			if(in==77){
				condition = false;
			}else{
				if(in==99){
					//split stream
					int num = Integer.parseInt(r.readLine())-1;
					double oldflow = streams.get(num);
					double percent = (double) Integer.parseInt(r.readLine());
					streams.add(num+1, oldflow*((100-percent)/100));
					streams.set(num, oldflow*(percent/100));
				}
				if(in==88){
					//join stream
					int num = Integer.parseInt(r.readLine())-1;
					double flow1 = streams.get(num);
					double flow2 = streams.get(num+1);
					streams.set(num, flow1+flow2);
					streams.remove(num+1);
				}
			}
		}
		NumberFormat nf = new DecimalFormat("##.###");
		for(int i=0; i<streams.size(); i++){
			System.out.print(nf.format(streams.get(i))+ " ");
		}

	}

}
