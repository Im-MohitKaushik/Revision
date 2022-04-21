package c2.question4;

import java.util.Scanner;

public final class Child extends Parent{
	
	
	public Child(int num){
		super(num);
	}
	
	@Override
	public void method1() {
		System.out.println("inside method 1 of child");
	}
	public void method4() {
		System.out.println("inside method4 of child");
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(num>0&&num<=10) {
			Parent p=new Child(num);
			p.method1();
			p.method2();
			p.method3();
			
			Child c=(Child)p;
			c.method4();
			
		}
		else {
			System.out.println("wrong number enterred");
		}
	}
	
}
