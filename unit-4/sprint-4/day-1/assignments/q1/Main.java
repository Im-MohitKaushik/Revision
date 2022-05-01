package day11.q1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
	
		TreeSet<Employee> ts=new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		int count=1;
		for(int i=0;i<4;i++) {
			System.out.println("enter Details of employee "+count);
			System.out.println("enter empid");
			int empid=sc.nextInt();
			System.out.println("enter emp name");
			String name=sc.next();
			System.out.println("enter emp salary");
			double sal=sc.nextDouble();
			
			
			ts.add(new Employee(empid,name,sal));
			count++;
		
		}
		System.out.println(ts);
	}

}
