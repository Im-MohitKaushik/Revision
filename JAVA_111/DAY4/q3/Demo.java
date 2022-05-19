package com.masai.q3;

public class Demo {

	public static void main(String[] args) {
			Student s1=Student.getStudent(true);
			System.out.println("PASSING TRUE");
			System.out.println("=================================================");
			System.out.println("roll is : "+s1.getRoll());
			System.out.println("name is : "+s1.getName());
			System.out.println("addreess is : "+s1.getAddress());
			System.out.println("Collage name is : "+s1.getCollageName());
			System.out.println("=================================================");
			
			Student s2=Student.getStudent(false);
			System.out.println("PASSING FALSE");
			System.out.println("=================================================");
			System.out.println("roll is : "+s2.getRoll());
			System.out.println("name is : "+s2.getName());
			System.out.println("addreess is : "+s2.getAddress());
			System.out.println("Collage name is : "+s2.getCollageName());
			System.out.println("=================================================");
			
			
	}

}
