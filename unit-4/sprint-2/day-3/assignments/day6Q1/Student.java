package day6Q1;

public class Student {
	
	int studId;
	String studName;
	double examFee =50000;
	
	void displayDetails(){
		System.out.println("Student ID : "+ studId);
		System.out.println("Studemnt name : "+studName);
				
	}
	
	double payFee(double pf) {
		return pf;
	}
	
	
	
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getExamFee() {
		return examFee;
	}

	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}

	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
		
		
	}

	public Student(){
		
		
	}

}
