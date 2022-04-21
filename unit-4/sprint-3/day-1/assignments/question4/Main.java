package day8.question4;

import java.util.Scanner;

public class Main {

	int age[];

	public void calculateAverage(int age[]) {
		double sum = 0;
		for (int j = 0; j < age.length; j++) {
			sum = sum + (double) age[j];
		}
		System.out.println("The average age is :" + (sum / age.length));

	}
//	for adding elements

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no.of employees:");
		int noOfEmployees = sc.nextInt();
		if (noOfEmployees >= 2) {
			int arr[] = new int[noOfEmployees];
			int flag=0;
			for (int i = 0; i < noOfEmployees; i++) {
				System.out.println("Enter the age for " + noOfEmployees + " employees:");
				int x = sc.nextInt();
				if (x >= 28 && x <= 40) {
					arr[i] = x;
				} else {
					flag=1;
					System.out.println("Invalid age encountered ! ");
					break;
				}
			}
			if(flag==0) {
				m.calculateAverage(arr);
			}
			
		}
		else {
			System.out.println("Please enter a valid employee count");
		}

//		m.calculateAverage(m.age);

	}
}
