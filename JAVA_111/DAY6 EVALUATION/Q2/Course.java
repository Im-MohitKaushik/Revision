package com.masai.Q2;

import java.util.Scanner;

public class Course {

	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails() {
		System.out.println("course id is : "+courseId);
		System.out.println("course fee is : "+courseFee);
		System.out.println("course name is : "+courseName);
		System.out.println("===============================================");
	}
	
	static void authenticate(String username,String password) {
			if(username.equals("Admin")&&password.equals("1234")) {
				System.out.println("login succes : pls enter record !");
				Scanner sc=new Scanner(System.in);
				System.out.println("enter course ID : ");
				int courseId=sc.nextInt();
				System.out.println("enter Course name : ");
				String courseName=sc.next();
				System.out.println("enter course FEE : ");
				int courseFee=sc.nextInt();
				Course c1=new Course();
				c1.courseFee=courseFee;
				c1.courseId=courseId;
				c1.courseName=courseName;
				c1.displayCourseDetails();
			}
			else {
				System.out.println("Invalid Username or password");
			}
		
	}
	public static void main(String[] args) {
		System.out.println("calling by valid admin pass");
		Course.authenticate("Admin", "1234");
		System.out.println("calling by invlaid crediantials ");
		Course.authenticate("ankit", "ankit");

	}

}
