package day6Q3;

import java.util.Scanner;

public class Demo {

	public static Bank getBank(String bank) {
		if(bank.equals("axis")||bank.equals("AXIS")) {
			return new AxisBank();
		}
		else if(bank.equals("icici")||(bank.equals("ICICI"))) {
			return new ICICIBank();
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER BANK NAME");
		String bankName=sc.next();
		Bank b=Demo.getBank(bankName);
		b.displayDetails();
		
		
	}
	
	
}
