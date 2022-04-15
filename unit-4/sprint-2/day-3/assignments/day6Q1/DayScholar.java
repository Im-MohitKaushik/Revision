package day6Q1;

public class DayScholar extends Student {

	Student s1=new Student();
	double transportFee =13000;
		

	@Override
	void displayDetails(){
		System.out.println("Student ID : "+ studId);
		System.out.println("Studemnt name : "+studName);
		System.out.println("student EXAM FEE IS  : "+ s1.examFee);
		System.out.println("student transport FEE is : "+ transportFee);
		System.out.println(" total fees to be paid : "+ (transportFee+s1.examFee));
		
				
	}
	@Override
	double payFee(double pf) {
		return ((s1.examFee+transportFee)-pf);
		
	}
	
	
	
	public DayScholar(int studId, String studName,double pf) {
		super(studId, studName);
		double remamt=this.payFee(pf);
		this.displayDetails();
		System.out.println(" total fees paying ryt now is : "+ pf);
		System.out.println("Remaining fees is : "+ remamt);
		System.out.println("############################################################################################################");
	}

	
	public  DayScholar(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
