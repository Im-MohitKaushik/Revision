package day6Q1;

public class Hosteller extends Student {

	double hostelFee=25000;
	Student s2 = new Student();


	@Override
	void displayDetails() {
		System.out.println("Student ID : " + studId);
		System.out.println("Studemnt name : " + studName);
		System.out.println("student EXAM FEE IS  : "+ s2.examFee);
		System.out.println("student HOSTEL  FEE is : "+ hostelFee);
		System.out.println(" total fees to be paid : "+ (hostelFee+s2.examFee));

	}

	@Override
	double payFee(double pf) {
		return ((s2.examFee+hostelFee)-pf);

	}

	public Hosteller(int studId, String studName,double pf) {
		super(studId, studName);
		double remamt=this.payFee(pf);
		this.displayDetails();
		System.out.println(" total fees paying ryt now is : "+ pf);
		System.out.println("Remaining fees is : "+ remamt);
		System.out.println("############################################################################################################");
	}

	public Hosteller() {

	}

}
