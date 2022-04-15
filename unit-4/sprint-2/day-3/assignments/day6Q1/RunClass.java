package day6Q1;

import java.util.Scanner;

public class RunClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER 1 for Hosteller OR 2 for Day  Sholar  AND enter 3 to LOGOUT FROM SYSTEM");
		byte cat = sc.nextByte();	
			while(cat==1||cat==2) {
				
				
				if (cat == 1) {

					System.out.println("Enter student id :");
					int id = sc.nextInt();
					System.out.println("Enter student name :");
					String name = sc.next();

					System.out.println("enter the fees You r Paying ryt now:");
					double pf = sc.nextDouble();

					Hosteller hs = new Hosteller(id, name, pf);

				}

				 if(cat==2){

					System.out.println("Enter student id :");
					int id = sc.nextInt();
					System.out.println("Enter student name :");
					String name = sc.next();

					System.out.println("enter the fees You r Paying ryt now:");
					double pf = sc.nextDouble();

					DayScholar ds = new DayScholar(id, name, pf);

				}
				 System.out.println("ENTER 1 for Hosteller OR 2 for Day  Sholar  AND enter 3 to LOGOUT FROM SYSTEM");
				  cat = sc.nextByte();	
			}
			System.out.println("thanku for your usage");
			
			 
			
			
		}

		
		 
			
		}

	


