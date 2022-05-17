package com.masai.Q3;

import java.util.Scanner;

public class Q3 {

	private static void sumNatNum(int number) {
		if (number > 0) {
			for (int i = 1; i <= number; i++) {
				int sum = ((i * (i + 1)) / 2);
				System.out.println(sum);

			}
		} else {
			System.out.println("Enter naturl number only");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Natural Number");
		int Number = sc.nextInt();
		sc.close();
		Q3.sumNatNum(Number);
	}

}
