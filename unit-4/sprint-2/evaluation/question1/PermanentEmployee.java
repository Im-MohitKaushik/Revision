package c2.question1;

public class PermanentEmployee extends Employee {

	private double basicPay;

	

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}
	

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double pfamt=basicPay*(0.12);
		salary=basicPay-pfamt;
		
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
}
