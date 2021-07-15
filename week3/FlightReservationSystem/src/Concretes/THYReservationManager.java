package Concretes;

import Abstracts.BaseReservationManager;
import Entities.Flight;

public class THYReservationManager extends BaseReservationManager {

	int choice;
	
	public THYReservationManager(int numberOfSeats) {
		super(numberOfSeats);
	}
	
	@Override
	public void getReservation(Flight flight) {
		System.out.println("***Welcome to Turkish Airlines*** "+"\n"+"For Business Class Seats press 0, For Economy Class Seats press 1");
		choice=scan.nextInt();
		getChoice(choice,flight);
		
	}

	public void getChoice(int choice,Flight flight) {
		if(choice==0) {
			getBusinessClassTicket(flight);
		}
		else if(choice==1) {
			getEconomyClassTicket(flight);
		}
		else {
			System.out.println("Please enter a valid choice");
		}
	}
	
	public void getBusinessClassTicket(Flight flight) {
		if(isBusinessSeatsFull()) {
			System.out.println("Unfortunately,all Business Class Tickets are full!");
		}
		else {
			System.out.println("Please select from available seats");
			for(int i=0;i<5;i++) {
				if(seats[i]==false) {
					System.out.print(i+" ");
				}
			}
			
			int selectedSeat=scan.nextInt();
			
			System.out.println("Number of seat "+selectedSeat+" was reserved in your name on the "+flight.getTime()
			+" flight from "+flight.getDate()+" to "+flight.getFlightName()+".");
			System.out.println("Have a nice flight!");
			
			seats[selectedSeat]=true;
			
		}
	}
	
	public void getEconomyClassTicket(Flight flight) {
		if(isEconomySeatsFull()) {
			System.out.println("Unfortunately,all Economy Class Tickets are full!");
		}
		else {
			System.out.println("Please select from available seats");
			for(int i=5;i<seats.length;i++) {
				if(seats[i]==false) {
					System.out.print(i+" ");
				}
			}
			
			int selectedSeat=scan.nextInt();
			
			System.out.println("Number of seat "+selectedSeat+" was reserved in your name on the "+flight.getTime()
			+" flight from "+flight.getDate()+" to "+flight.getFlightName()+".");
			System.out.println("Have a nice flight!");
			
			seats[selectedSeat-1]=true;
			
		}
	}
	
	
	

}
