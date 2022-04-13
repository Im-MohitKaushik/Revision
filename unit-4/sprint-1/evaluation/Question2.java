package eval1;

public class Question2 {

	public static void main(String[] args) {
		int dayOfWeek = 5;

		int schedule = dayOfWeek;
		switch (schedule) {
		case 1:
			System.out.println("monday - evaluation day");
			break;
		case 2:
			System.out.println("tusday -bajrangbali day");
			break;
		case 3:
			System.out.println(" wed - hectic day");
			break;
		case 4:
			System.out.println("thurs - bike day");
			break;
		case 5:
			System.out.println("fri -bajrangbali day");
			break;
		case 6:
			System.out.println(" sat - ready for masti day");
			break;

		default:
			System.out.println(" sunday - JALWA DAY");

		}
	}
}
