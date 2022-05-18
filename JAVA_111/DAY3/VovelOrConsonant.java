package com.masai.q3;

import java.util.Scanner;

public class VovelOrConsonant {

	private void vovelChecker(char c) {
		String vovel = "aeiouAEIOU";
		String consonant = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		Boolean flag = true;
		for (int i = 0; i < vovel.length(); i++) {
			if (vovel.charAt(i) == c) {
				System.out.println("CHARACTER is VOVEL !");
				flag = false;
				break;
			}
		}
		for (int i = 0; i < consonant.length(); i++) {
			if (consonant.charAt(i) == c) {
				System.out.println("CHARACTER is CONSONANT !");
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("INVALID CHARACTER !");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter CHARACTER :  ");
		char c = sc.next().charAt(0);
		sc.close();

		VovelOrConsonant vc = new VovelOrConsonant();
		vc.vovelChecker(c);

	}

}
