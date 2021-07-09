import java.util.Scanner;

public class Main {

	static double ticketPrice = 30;
	
	public static void main(String[] args) {
		
		
		
        String category1= "Romance";
        String category2= "Sci-fi";
        String category3= "Comedy";
        String category4= "Action";

        System.out.println("**WELCOME :)**");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What's your favourite category?");
        String category = scan1.nextLine();

    }
	
   public static void saleByAge(int age)
    {        
        
        if(age<18) {
            ticketPrice = ticketPrice - ( ticketPrice * 0.10);
            System.out.println("Ticket price: "+ ticketPrice +" TL");
        }
        else if(age >= 18 && age <=25) {
            ticketPrice = ticketPrice - ( ticketPrice * 0.05);
            System.out.println("Ticket price: "+ ticketPrice +" TL");
        }
        else {
            System.out.println("Ticket price: "+ ticketPrice +" TL");
        }
    }

     public static void saleByCategory(String category)
    {
        
        if (category == "1")
        {
            ticketPrice = ticketPrice - ( ticketPrice * 0.01);
            System.out.println("Ticket price: "+ ticketPrice +" TL");
        }
        else if(category == "2" || category == "3" || category == "4")
        {
            System.out.println("Ticket price: "+ ticketPrice +" TL");
        }

        else
        {
            System.out.println("Not found this category!");
        }
    }

	}


