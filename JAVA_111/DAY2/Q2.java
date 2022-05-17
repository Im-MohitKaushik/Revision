package com.masai.Q2;

import java.util.Scanner;

public class Q2 {

	private static void pF(int number) {

		if (number <= 100 && number >= 2) {
			for (int i = 1; i <=number; i++) {
				if (number % i == 0) {
					System.out.println(i);
				}
			}

		} else {
			System.out.println("Invalid number");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		sc.close();
		Q2.pF(number);
	}

}
