package com.masai.Q4;

import java.util.Scanner;

public class Q4 {
	
	private static void cricScore(int ones,int twos,int threes,int fours,int sixes) {
		int sum=ones+2*twos+3*threes+4*fours+6*sixes;
		System.out.println("TOTAL RUNS : "+sum);
			
		
	}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter RUNS details :");
			System.out.println("enters ones :");
			int ones=sc.nextInt();
			System.out.println("enters twos :");
			int twos=sc.nextInt();
			System.out.println("enters threes :");
			int threes=sc.nextInt();
			System.out.println("enters fours :");
			int fours=sc.nextInt();
			System.out.println("enters sixes :");
			int sixes=sc.nextInt();
			sc.close();
			Q4.cricScore(ones, twos, threes, fours, sixes);
	}

}
