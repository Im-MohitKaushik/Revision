package day8.ques1;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		if(amount>=1000) {
			Hotel th=new TajHotel();
			return th;
		}
		else if(amount>200&&amount<1000) {
			Hotel th=new RoadSideHotel();
			return th;
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int amount=sc.nextInt();
		Demo d1=new Demo();
		Hotel h=d1.provideFood(amount);
		if(h instanceof TajHotel) {
			h.chickenBiryani();
			h.maalaDosa();
			((TajHotel) h).welocmeDrink();
			
		}
		else if(h instanceof RoadSideHotel) {
			h.chickenBiryani();
			h.maalaDosa();
		}
		else {
			System.out.println("enter valid amount bro ");
		}
		
	}

}
