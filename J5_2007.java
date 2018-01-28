package ccc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J5_2007 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int N = s.nextInt();
		int[] oldmotels = {0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000};
		ArrayList<Integer> newmotels = new ArrayList<Integer>();
		for(int i=0; i<oldmotels.length; i++){
			newmotels.add(oldmotels[i]);
		}
		//add new motel locations
		for(int i=0; i<N; i++){
			newmotels.add(s.nextInt());
		}
		Collections.sort(newmotels);
		int[] motels = new int[newmotels.size()];
		for(int i=0; i<newmotels.size(); i++){
			motels[i] = newmotels.get(i);
		}
		int[] list = new int[motels.length];
		list[motels.length-1] = 1;
		//i=current motel or length, j="next" motel
		for(int i=motels.length-2; i>=0; i--){
			for(int j=i+1; j<motels.length; j++){
				if(motels[j]>=motels[i]+A && motels[j]<=motels[i]+B){
					list[i] += list[j];
				}
			}
		}
		System.out.println(list[0]);
	}

}
