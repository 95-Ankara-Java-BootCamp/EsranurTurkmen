import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	static List<Product> storage = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        boolean value = true;

        while(value) {            

                System.out.print("Enter a product name : ");
                String productName = scanner.nextLine();

                System.out.print("Enter count of products : ");
                int count = scanner.nextInt();
                scanner.nextLine();

                Product localProduct = productControl(productName);

                if (localProduct == null) {
                    Product newProduct = new Product(productName, count);

                    storage.add(newProduct);
                }else {
                    localProduct.setCount(localProduct.getCount() + count);
                }
            }
                           
        
        countProductsByName();

	}
	
	   public static Product productControl(String productName) {
	        for (Product product : storage) {
	            if(product.getName().equals(productName)) {
	                return product;
	            }
	        }
	        return null;
	    }
	   	  
	   public static void countProductsByName() {
	        for (Product product : storage) {
	            System.out.println(product.getCount() +"of "+product.getName() + " products were taken " );
	        }
	    }

}
