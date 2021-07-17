package Abstracts;

import java.util.Scanner;

public abstract class BaseReservationManager implements ReservationService {

    protected static Scanner scan=new Scanner(System.in);
	
	private int numberOfSeats;
	protected boolean[] seats;
	private int businessSeatsCount;
	
	public BaseReservationManager() {
		int numberOfSeats=10;
		seats=new boolean[numberOfSeats];
		
		for (int i = 0; i < numberOfSeats; i++)
            seats[i]=true;
	}
	
	public BaseReservationManager(int numberOfSeats, int businessSeatsCount) {
		
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
        
        this.businessSeatsCount=businessSeatsCount;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

		
	
	public boolean isEconomySeatsFull() {
		for (int i = businessSeatsCount+1; i < seats.length; i++) {
            if(seats[i])
                return false;
        }
        return true;
		
	}
	
	public boolean isBusinessSeatsFull() {
		
	    for (int i = 0; i < businessSeatsCount; i++) {
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
