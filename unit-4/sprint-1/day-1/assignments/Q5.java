package practice;

public class Q5 {
	public static void primeFactorial(int n) {
		if(n<2&&n>100) {
			System.out.println("Invalid number");
		}
		else {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					System.out.println(i);
				}
			}
			
			
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeFactorial(12);

	}
	
}
