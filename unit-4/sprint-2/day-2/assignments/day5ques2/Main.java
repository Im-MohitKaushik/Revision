package day5ques2;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Ticket t1=new Ticket();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter no of bookings");
			int noofbookings=sc.nextInt();
			System.out.println("Enter the available tickets");
			int avlTickets=sc.nextInt();
			
			Ticket.setAvailableTickets(avlTickets);
			
			for(int i=0;i<noofbookings;i++) {				
				System.out.println("Enter the ticketid");
				int ticketID=sc.nextInt();
				System.out.println("Enter the price");
				int price=sc.nextInt();
				System.out.println(" Enter the no of tickets");
				int nooftickets=sc.nextInt();
					
				t1.setPrice(price);
				t1.setTicketid(ticketID);
				System.out.println("Available tickets:"+Ticket.getAvailableTickets());
			
				
				int totalamt= t1.calculateTicketCost(nooftickets);
				
				
				System.out.println("total amount : "+totalamt);
				System.out.println("Available ticket after booking :"+Ticket.getAvailableTickets());
				
				
				
			}
			sc.close();
			
	}

}
