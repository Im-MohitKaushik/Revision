package com.masai.q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter Number of Students you want to enter");
		System.out.println("=====================================================");
		
		Scanner sc=new Scanner(System.in);
		int tc=	sc.nextInt();
		int i=1;
		while(i<=tc) {
			System.out.println("enter the roll no : ");
			int rollNumber=sc.nextInt();
			System.out.println("enter name :");
			String studentName=sc.next();
			System.out.println("enter marks : ");
			int marks = sc.nextInt();
			
			Student s1=new Student(rollNumber,studentName,marks);
			System.out.println(" Student details : "+i);
			System.out.println(" Student rollnumber : "+s1.getRollNumber());
			System.out.println(" Student name : "+s1.getStudentName());
			System.out.println(" Student marks : "+s1.getMarks());
			System.out.println("=====================================================");
			i++;
		}
		
		
		
		
	}

}
