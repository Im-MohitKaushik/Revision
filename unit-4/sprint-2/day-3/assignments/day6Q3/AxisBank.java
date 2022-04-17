package day6Q3;

public class AxisBank extends Bank {
	
	
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	double rateOfInterest=10;
//	
	@Override
	void displayDetails(){
		System.out.println("branch name is AXIS BANK ");
		System.out.println("ISFC CODE IS 000AXIS12345 ");
		System.out.println("INTEREST RATE IS :"+rateOfInterest);
		
		getCreditCard();
	}
	
   void	getCreditCard(){
		System.out.println("Get the Credit Card from the Axis bank");
	}
	
	
	
	
	
	
}
