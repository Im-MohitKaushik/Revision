package day8.question3;

import java.util.Scanner;

public class Mobile {
	
	public void mobileCompany(String company,String model) {
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(model.equals(arr[i])) {
				flag=1;
				System.out.println(arr[i]+"_OUTDATED");
				break;
			}
		}
		 if(flag==0) {
			 
			System.out.println("Company is "+company);
			System.out.println("model is "+ model);
			
		}
	}
	String[] arr= {"note4","note5","note6","note7"};
	public static void main(String[] args) {
		Mobile m=new Mobile();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mobile company");
		String company=sc.next();
		System.out.println("enter mobile model");
		String model=sc.next();
		m.mobileCompany(company, model);
		
	}
	
}
