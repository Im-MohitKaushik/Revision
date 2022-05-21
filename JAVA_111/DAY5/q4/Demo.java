package com.masai.q4;

import java.util.Scanner;

public class Demo {
		
		
		
		
		
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student s=new Student();
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER NO OF STUDENTS :");
			int nos=sc.nextInt();
			
			int arr[] = new int[nos];
			for(int i=0;i<nos;i++) {
				System.out.println("enter Roll No of  student"+(i+1));
				int roll=sc.nextInt();
				System.out.println("enter Name No of  student"+(i+1));
				String name=sc.next();
				System.out.println("enter Address No of  student"+(i+1));
				String add=sc.next();
				System.out.println("enter Marks No of  student"+(i+1));
				int marks=sc.nextInt();
				
				s.setRoll(roll);
				s.setName(name);
				s.setAddress(add);
				s.setMarks(marks);
				
				arr[i]=marks;
				
				System.out.println("#####################################");
				System.out.println("Roll no :"+s.getRoll());
				System.out.println("Name :"+s.getName());
				System.out.println("Address  :"+s.getAddress());
				System.out.println("Marks :"+s.getMarks());
				System.out.println("#####################################");
				
				
			}
			
			 int sum = 0;
			 
		        // sum of all values in array using for loop
		        for (int j = 0; j < arr.length; j++) {
		            sum += arr[j];
		        }
			System.out.println(" average students marks is : "+ (sum/arr.length));
		}
}
