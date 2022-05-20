package com.masai.q1;

import java.util.Scanner;

public class Main {
	
	
	public static Employee getEmployeeDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter salary");
		double salary=sc.nextDouble();
	
		Employee e1=new Employee(id,name,salary);
		return e1;
		
	}
	
	public static int getPFPercentage(){
		System.out.println("enter pf percent");
		Scanner sc=new Scanner(System.in);
		int pfpercentage=sc.nextInt();	
		return pfpercentage;
	}
	public static void main(String[] args) {
		Employee e1=Main.getEmployeeDetails();
		int pfp=Main.getPFPercentage();
		
		e1.calculatenetSalary(pfp);
		
		System.out.println("ID : "+e1.getEmployeeId());
		System.out.println("Name : "+e1.getEmployeeName());
		System.out.println("salary : "+e1.getSalary());
		System.out.println("Net Salary : "+e1.getNetSalary());
		

	}

}
