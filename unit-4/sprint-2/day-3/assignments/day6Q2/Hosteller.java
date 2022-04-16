package day6Q2;

import java.util.Scanner;

public class Hosteller extends Student {
	
	String hostelName;
	int roomNumber;
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Hosteller(int studentId, String name, int departmentId, String gender, String phone, String hostelName,
			int roomNumber) {
		super(studentId, name, departmentId, gender, phone);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Modify room number(Y/N)");		
		String ans1=sc.next();
		if(ans1.equals("Y")) {
			System.out.println("New room number :");
			int newroomnumber=sc.nextInt();		
			setRoomNumber(newroomnumber);
		}
		System.out.println("Modeify phone number(Y/N)");
		String ans2=sc.next();
		if(ans2.equals("Y")) {
			System.out.println("New phone number :");
			String newphnnumber=sc.next();
			this.setPhone(newphnnumber);
		}
		
		
		
		
	}
	public Hosteller() {
		
	}
	

}
