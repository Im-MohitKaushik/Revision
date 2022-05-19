package com.masai.q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setName("WITHOUT parameteraised constructor");
		s1.setAge(25);
		s1.setRoll(1);
		s1.setMarks(49);
		System.out.println("=============================================");
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getMarks());
		System.out.println("=============================================");
		
		System.out.println("suppose we set wrong marks with s1");
		System.out.println("let me set s1.setamrks(60)---then output will show invalid marks");
		s1.setMarks(60);
		
		
		Student s2=new Student(2,"with parameterised constructor ",26,45);
		System.out.println("=============================================");
		System.out.println(s2.getRoll());
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getMarks());
		System.out.println("=============================================");
		
		

	}

}
