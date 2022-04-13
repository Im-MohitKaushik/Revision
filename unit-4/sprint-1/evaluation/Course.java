package eval1;

public class Course {

	int courseId;
	String courseName;
	int courseFee;

	public void displayCourseDetails() {
		System.out.println(courseId);
		System.out.println(courseName);
		System.out.println(courseFee);
	}

	public static void authenticate(String username, String password) {
		if (username == "Admin" && password == "1234") {
			Course c1 = new Course();
			c1.courseId = 7035;
			c1.courseName = "JAVA CODER CHAMPION";
			c1.courseFee = 9;
			
			c1.displayCourseDetails();

		}
		else {
			System.out.println("Invalid Username or password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		authenticate("Admin","1234");
		authenticate("Admin","12356");
		
	}

}
