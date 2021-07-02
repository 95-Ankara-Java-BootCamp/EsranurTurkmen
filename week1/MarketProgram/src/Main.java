import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double pear,apple,banana,tomato,eggplant;
		
		float total;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a kilogram of pear: ");
		pear=scan.nextDouble();
		
		System.out.println("Enter a kilogram of apple: ");
		apple=scan.nextDouble();
		
		System.out.println("Enter a kilogram of banana: ");
		banana=scan.nextDouble();
		
		System.out.println("Enter a kilogram of tomato: ");
		tomato=scan.nextDouble();
		
		System.out.println("Enter a kilogram of eggplant: ");
		eggplant=scan.nextDouble();
		
		total=(float) ((Double)(pear*2.14)+(apple*3.67)+(tomato*1.11)+(banana*0.95)+(eggplant*5));
		
		System.out.println("Total: "+total+"TL");

	}

}
