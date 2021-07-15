package Abstracts;

import java.util.Scanner;

public abstract class BaseReservationManager implements ReservationService {

    protected Scanner scan=new Scanner(System.in);
	
	private int numberOfSeats;
	protected boolean[] seats;
	
	public BaseReservationManager() {
		int numberOfSeats=10;
		seats=new boolean[numberOfSeats];
		
		for (int i = 0; i < numberOfSeats; i++)
            seats[i]=true;
	}
	
	public BaseReservationManager(int numberOfSeats) {
		
		if(numberOfSeats<10) {
			System.out.println("Seat number error! Number of seats automatically assigned to 10");
			this.numberOfSeats=10;
			
			}
			else {
				this.numberOfSeats = numberOfSeats;
			}
		
		seats=new boolean[this.numberOfSeats];
        for (int i = 0; i < this.numberOfSeats; i++)
            seats[i]=true;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

		
	
	public boolean isEconomySeatsFull() {
		for (int i = 5; i < seats.length; i++) {
            if(seats[i])
                return false;
        }
        return true;
		
	}
	
	public boolean isBusinessSeatsFull() {
		
	    for (int i = 0; i < 5; i++) {
	            if(seats[i])
	                return false;
	        }
	        return true;
	}
	
	public boolean allSeatsFull() {
		
		for (int i = 0; i < seats.length; i++) {
            if(seats[i])
            return false;
        }
        return true;
	}
	
	
}
