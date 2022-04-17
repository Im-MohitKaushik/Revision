package sprint2day4.question2;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public Student() {
		
	}
	
	public void displayDetails() {
		Student s1=new Student(getRoll(),getName(),getMarks());
		char g=s1.calculateGrade(getMarks());
		System.out.println(toString());	
		System.out.println("GRADE IS : "+g);
		
	}
	private char calculateGrade(int marks) {
		if(marks>=500) {
			return 'A';
		}
		else if(marks<500&&marks>=400) {
			return 'B';
		}
		else{
			return 'C';
		}
	}
	@Override
    public String toString() {
        return "ROLL NO IS : "+this.roll+" NAME IS :  "+  this.name+" MARKS ARE : "+ this.marks;
    }
	

}
