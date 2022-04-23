package day9.Q1;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account  digit number");
		int accountNumber=sc.nextInt();
		Account a1=new Account(accountNumber);
		System.out.println("enter deposit amount");
		double amount_d=sc.nextDouble();
		a1.deposit(amount_d);
		System.out.println("enter wothdraw amount ");
		double amount_w=sc.nextDouble();
		try {
			a1.withdraw(amount_w);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("last line of main");
		
	}

}
