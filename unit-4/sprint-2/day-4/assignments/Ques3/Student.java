package day7.Ques3;

public abstract class  Student {

	String name;
	String Address;
	
	public abstract void getPercentage();
	
	public static void  getTotalNoStudents() {
		
	}

	public Student(String name, String address) {
		super();
		this.name = name;
		Address = address;
	}
	public Student() {
		
	}
	
	
}
