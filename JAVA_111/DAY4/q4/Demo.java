package com.masai.q4;

public class Demo {
	
	private void Q4test(int i) {
		
		if(i>=0) {
			if(i%2==1) {
			System.out.println(i);
		}
		if(i%2==0){
			while(i<i+10) {
				i++;
				if(i%10==0) {
					System.out.println(i);
					break;
				}
			}
		}
			
			
		}
		else {
			System.out.println("Error");
		}
		
		
	}
	
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.Q4test(44);
		d1.Q4test(45);
		d1.Q4test(-5);
		

	}

}
