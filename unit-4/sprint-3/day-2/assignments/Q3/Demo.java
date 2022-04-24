package day9.Q3;

import java.util.Scanner;

public class Demo {

	public void showDetails(Month m) throws Exception {
		
		switch (m) {
		case JAN:
			System.out.println("“This is the 1st Month of the Year January");
			break;
		case FEB:
			System.out.println("“This is the 2st Month of the Year FEBRUARY");
			break;
		case MAR:
			System.out.println("“This is the 3st Month of the Year MARCH");
			break;
		case APR:
			System.out.println("“This is the 4st Month of the Year APRIL");
			break;
		case MAY:
			System.out.println("“This is the 5st Month of the Year MAY");
			break;
		case JUN:
			System.out.println("“This is the 6st Month of the Year JUNE");
			break;
		case JUL:
			System.out.println("“This is the 7st Month of the Year JULY");
			break;
		case AUG:
			System.out.println("“This is the 8st Month of the Year February");
			break;
		case SEP:
			System.out.println("“This is the 9st Month of the Year February");
			break;
		case OCT:
			System.out.println("“This is the 10st Month of the Year February");
			break;
		case NOV:
			System.out.println("“This is the 11st Month of the Year NOVEMBER");
			break;
		case DEC:
			System.out.println("“This is the 12st Month of the Year DECEMBER");
			break;

		default:
			throw new Exception("Invalid Month Name");
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter month 1st 3 letters");
		String mn=sc.next();
		String month=mn.toUpperCase();
		
		try {
			Month month1=Month.valueOf(month);
			Demo d1=new Demo();
			d1.showDetails(month1);
		} catch (Exception ime) {
			// TODO Auto-generated catch block
//			ime.printStackTrace();
			System.out.println(ime.getMessage());
			System.out.println("INVALID MONTH");
			
		}
		System.out.println("end of main of Demo");
	}

}
