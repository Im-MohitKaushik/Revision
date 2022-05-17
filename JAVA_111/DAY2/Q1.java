package com.masai.question1;

import java.util.Scanner;

public class Q1 {

	private static void cityDetails(String city) {
		switch (city) {

		case "Delhi":
			System.out.println("Financial city");
			break;
		case "Kolkata":
			System.out.println("City of Joy");
			break;
		case "Bangalore":
			System.out.println("Cyber city");
			break;
		case "delhi":
			System.out.println("Financial city");
			break;
		case "kolkata":
			System.out.println("City of Joy");
			break;
		case "bangalore":
			System.out.println("Cyber city");
			break;
		default:
			System.out.println("May be Other Indian City");
			break;

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter city");
		String city = sc.next();
		Q1.cityDetails(city);
		sc.close();

	}

}
