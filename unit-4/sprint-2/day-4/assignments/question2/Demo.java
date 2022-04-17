package sprint2day4.question2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no");
		int roll=sc.nextInt();
		System.out.println("enter name ");
		String name=sc.next();
		System.out.println("enter marks");
		int marks=sc.nextInt();
		
		s1.setRoll(roll);
		s1.setName(name);
		s1.setMarks(marks);
		s1.displayDetails();
		sc.close();
		
		
	}

}
