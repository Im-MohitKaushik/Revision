package com.masai.Q2;

import java.util.Scanner;

public class CheckWeather {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is it RAINING : ? enter true or false !");
		boolean isRaining = sc.nextBoolean();
		System.out.println("Is it Snowing : ? enter true or false !");
		boolean isSnowing = sc.nextBoolean();
		System.out.println("Enter temperature :  in Fahrenhiet");
		double temperature = sc.nextDouble();
		sc.close();

		if (temperature < 50 || isSnowing == true || isRaining == true) {
			System.out.println("Let’s stay home.");
		} else {
			System.out.println("Let’s go out!");
		}

	}

}
