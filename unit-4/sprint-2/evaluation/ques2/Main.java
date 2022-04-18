package c2.ques2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t=new Ticket();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of bookings");
		int noofbookings=sc.nextInt();		
		System.out.println("enter no available tickets");
		int avltickets=sc.nextInt();
		t.setAvailableTickets(avltickets);
		for(int i=0;i<noofbookings;i++) {
			System.out.println("enter the ticket ID");
			int ticketid=sc.nextInt();
			System.out.println("enter the price");
			int price=sc.nextInt();
			System.out.println("enter no of tickets");
			int nooftickets=sc.nextInt();
			t.setTicketId(ticketid);
			t.setPrice(price);
			System.out.println("Available tickets :"+t.getAvailableTickets());
			System.out.println("Total amount: "+t.calculateTicketCost(nooftickets));
			System.out.println("Available ticket after booking: "+t.getAvailableTickets());
		}

	}

}
