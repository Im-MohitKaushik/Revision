package com.masai.q2;

public class Demo {
	
	public Demo() {
		new Demo("s");
		System.out.println("inside DEMO()-- cons1    of class DEMO");
	}
	public Demo(String s) {
		new Demo(10);
		System.out.println("inside DEMO(String s)-- cons2    of class DEMO");
	}
	public Demo(int i) {
		new Demo(125f);
		System.out.println("inside DEMO(int i)-- cons3    of class DEMO");
	}
	public Demo(float f) {
		System.out.println("inside DEMO(float f)-- cons4    of class DEMO");
	}
	
	public static void main(String[] args) {
		new Demo();
		
	}

}
