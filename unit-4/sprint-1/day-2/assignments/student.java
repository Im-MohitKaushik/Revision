package sprint1Day2;

public class student {
	int roll;
	String name;
	int marks;

	public void displayStudentDetails() {
		System.out.println("Roll is :" + roll);
		System.out.println("Name is :" + name);
		System.out.println("Marks is :" + marks);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		s1.roll = 1;
		s1.name = "ankit";
		s1.marks = 100;

		student s2 = new student();
		s2.roll = 2;
		s2.name = "ankur";
		s2.marks = 99;

		s1.displayStudentDetails();
		s2.displayStudentDetails();

		s1 = null;
		s2 = null;

	}

}
