package com.masai.Q4;

public class Student {

	int roll = 01;
	String name = "ankit singh yadav";
	int marks = 100;

	private void displayStudentDetails() {
		System.out.println("Roll is :" + roll);
		System.out.println("Name is :" + name);
		System.out.println("Marks is :" + marks);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.displayStudentDetails();
		s1 = null;
		s2.displayStudentDetails();
		s2 = null;
	}

}
