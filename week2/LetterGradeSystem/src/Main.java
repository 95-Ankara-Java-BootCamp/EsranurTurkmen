import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		   int firstNote,finalNote;
		   double grade;
		    
		   Scanner scan= new Scanner(System.in);
		     
		   System.out.println("Enter a first note: ");
		   firstNote=scan.nextInt();
		     
		   System.out.println("Enter a final note: ");
		   finalNote=scan.nextInt();
		     
		   grade=(firstNote*0.40+finalNote*0.60);
		   System.out.println("Your grade: "+grade);
		     
		     
		   if (grade>85) {
		         
		         System.out.println("AA");
		     
		   }
		     
		   else if (grade<85 && grade>80) {
		         
		         System.out.println("BA");
		    
		   }
		     
		   else if (grade<80 && grade>75) {
		         
		         System.out.println("BB");
		     
		   }
		     
		   else if (grade<75 && grade>65) {
		         
		         System.out.println("CB");
		    
		   }
		    
		   else if (grade<65 && grade>60) {
		         
		         System.out.println("CC");
		     
		   }
		     
		   else if (grade<60&& grade>55) {
		         
		         System.out.println("CD");
		     
		   }
		      
		   else if (grade<55 && grade>50) {
		         
		         System.out.println("DD");
		     
		   }
		      
		   else{
		         System.out.println("FF, you fail!");
		      
		   }
		  }

	}


