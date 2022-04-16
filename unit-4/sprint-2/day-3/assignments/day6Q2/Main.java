package day6Q2;

import java.util.Scanner;

public class Main {


	
	
	public static Hosteller getHostellerDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student ID :");
		int studentId=sc.nextInt();
		System.out.println("enter student name :");
		String name=sc.next();
		System.out.println("enter department ID  :");
		int departmentId=sc.nextInt();
		System.out.println("enter student gender :");
		String gender=sc.next();
		System.out.println("enter student phone :");
		String phone=sc.next();
		System.out.println("enter student Hostel name :");
		String hostelName=sc.next();
		System.out.println("enter room number :");
		int roomNumber=sc.nextInt();
		Hosteller h1=	new Hosteller(studentId,name,departmentId,gender,phone,hostelName,roomNumber);
		return h1;
	}
	@Override 
	public String toString() {
		Hosteller h2=getHostellerDetails();
		return h2.getStudentId()+" "+ h2.getName()+" "+h2.getDepartmentId()+" "+h2.getGender()+" "+h2.getPhone()+" "+h2.getHostelName()+" "+h2.getRoomNumber();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new Main().toString();
		System.out.println(s1);
		
	}

}
