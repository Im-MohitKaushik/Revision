package sprint1Day4;

public class Student {
//	roll: Integer name: String age: Integer marks: Integer

	private int roll;
	private String name;
	private String age;
	private int marks;

	public Student() {
		// zero argument constructor
	}

	public int getRoll() {
		return roll;
	}

	public Student(int roll, String name, String age, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public void showDetails() {
		System.out.println("Roll is :" + roll);
		System.out.println("Name is :" + name);
		System.out.println("Age is :" + age);
		System.out.println("Marks is :" + marks);
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

	public String getAge() {

		return age;
	}

	public void setAge(String age) {
		if (Integer.valueOf(age) > 18 && Integer.valueOf(age) < 60) {
			this.age = age;
		} else {
			System.out.println("wrong age entered");
		}

	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if (marks > 0 && marks < 500) {

			this.marks = marks;
		} else {
			System.out.println("wrong marks entered");
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		// //using zero argument constructor
		s1.setRoll(12);
		s1.setName("ankit");
		s1.setMarks(400);
		s1.setAge("26");
		System.out.println("student 1 details are :");
		s1.showDetails();
		System.out.println("-----------------------------------------------------------");
//		  //using parameterized constructor 
		Student s2 = new Student(13, "ankur", "24", 400);
		System.out.println("name is:" + s2.getName());
		System.out.println("rollno  is:" + s2.getRoll());
		System.out.println("age is:" + s2.getAge());
		System.out.println("marks is:" + s2.getMarks());
		
	}

}
