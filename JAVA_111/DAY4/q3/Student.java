package com.masai.q3;


public class Student {

	private int roll;
	private String name;
	private String address;
	private String collageName;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	
	
	
	public Student(int roll, String name, String address, String collageName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
	}
	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	public static Student getStudent(boolean isFromNIT) {
		
		if(isFromNIT==true) {
			Student s1=new Student(12,"ankit","kanpur");
			s1.setCollageName("NIT");
			return s1;
		}
		else {
			Student s1=new Student(19,"ankur","Delhi","Ahmednagar college");
			return s1;
		}
		
		
	}
	
	
}
