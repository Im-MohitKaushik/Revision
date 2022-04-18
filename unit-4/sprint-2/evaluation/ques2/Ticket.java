package c2.ques2;

public class Ticket {

	int ticketId;
	int price;
	int availableTickets;
	
	
	
	public int getTicketId() {
		return ticketId;
	}



	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getAvailableTickets() {
		return availableTickets;
	}



	public void setAvailableTickets(int availableTickets) {
		if(availableTickets>0) {
			
			this.availableTickets = availableTickets;
		}
		else {
			System.out.println("tickets stocl declined");
		}
	}

	public int calculateTicketCost(int nooftickets) {
		if(getAvailableTickets()>0) {
			setAvailableTickets(getAvailableTickets()-nooftickets);
			return nooftickets*price;
		}
		else {
			return -1;
		}
	}

	

}
