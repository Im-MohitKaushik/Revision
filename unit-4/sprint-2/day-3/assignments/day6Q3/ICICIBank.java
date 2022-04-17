package day6Q3;

public class ICICIBank extends Bank {
	
	
	double rateOfInterest=12;
	
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
//	
	@Override
	void displayDetails(){
		System.out.println("branch name is ICICI BANK");
		System.out.println("ISFC CODE IS 000ICICI12345 ");
		System.out.println("INTEREST RATE IS :"+rateOfInterest);
		
	}
	
	
	
}
