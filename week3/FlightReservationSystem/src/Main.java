import java.util.Scanner;

import Abstracts.BaseReservationManager;
import Concretes.PegasusReservationManager;
import Concretes.THYReservationManager;
import Entities.Flight;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		BaseReservationManager thy=new THYReservationManager(10,5);
		
		
		BaseReservationManager pegasus=new PegasusReservationManager(10,3);
		
		
		int choice;
		
	       while(true)
	        {
	    	   
	            System.out.println("Please for THY press 0, for Pegasus press 1.");
	                       
	            System.out.println("Press 2 for exit."); 
             
	            choice=scan.nextInt();
            
	            switch(choice)
	            {
	           
	                case 0:
	                	thy.getReservation(new Flight(1,"Istanbul-Londra","01.08.2021","13.00"));
	                    
	                break;
	                
	                case 1 :
	                	pegasus.getReservation(new Flight(2,"Istanbul-Hollywood","18.07.2021","02.00"));
	                	
	                break;
	                
	                case 2:
	                        System.out.println("Exiting.Have a nice day!");
	                        scan.close();
	                        
	                break;
	              
	            }

	} 
	       
	}

}
