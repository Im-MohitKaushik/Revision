package day7.Ques3;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String query = "Y";
		int countH = 0;
		int countS = 0;

		while (query.equals("Y")) {
			System.out.println("enter student subject : ");
			System.out.println("For  HISOTRY ENTER H & for SCIENCE ENTER S");
			String x = sc.next();

			if (x.equals("H")) {

				System.out.println("enter history student details");

				System.out.println("enter name :");
				String name = sc.next();
				System.out.println("enter address : ");
				String address = sc.next();
				System.out.println("enter history marks");
				int historyMarks = sc.nextInt();
				while (historyMarks < 0 || historyMarks > 100) {
					System.out.println("wrong marks enytered");
					System.out.println("enter history marks again");
					historyMarks = sc.nextInt();
				}

				System.out.println("enter civics marks");
				int civicsMarks = sc.nextInt();
				while (civicsMarks < 0 || civicsMarks > 100) {
					System.out.println("wrong marks enytered");
					System.out.println("enter history marks again");
					civicsMarks = sc.nextInt();
				}

				HistoryStudent h1 = new HistoryStudent();
				h1.name = name;
				h1.Address = address;
				h1.setHistoryMarks(historyMarks);
				h1.setCivicsMarks(civicsMarks);
				h1.getPercentage();
				countH++;

			} else if (x.equals("S")) {

				System.out.println("enter science student details");

				System.out.println("enter name :");
				String name = sc.next();
				System.out.println("enter address : ");
				String address = sc.next();
				System.out.println("enter physics marks");
				int pMarks = sc.nextInt();
				while (pMarks < 0 || pMarks > 100) {
					System.out.println("wrong marks enytered");
					System.out.println("enter history marks again");
					pMarks = sc.nextInt();
				}

				System.out.println("enter chemistry  marks");
				int cMarks = sc.nextInt();
				while (cMarks < 0 || cMarks > 100) {
					System.out.println("wrong marks enytered");
					System.out.println("enter history marks again");
					cMarks = sc.nextInt();
				}
				System.out.println("enter maths marks");
				int mMarks = sc.nextInt();
				while (mMarks < 0 || mMarks > 100) {
					System.out.println("wrong marks enytered");
					System.out.println("enter history marks again");
					mMarks = sc.nextInt();
				}

				ScienceStudent h1 = new ScienceStudent();
				h1.name = name;
				h1.Address = address;
				h1.setMathsMarks(mMarks);
				h1.setChemistryMarks(cMarks);
				h1.setPhisicsMarks(pMarks);

				h1.getPercentage();
				countS++;

			} else {
				System.out.println("enter correct code ");
			}
			System.out.println("do you want to enter more student data (Y/N)");
			query=sc.next();
		}
		
		System.out.println("no of history students are "+ countH);
		System.out.println("no of science students are "+ countS);
		
		

	}

}