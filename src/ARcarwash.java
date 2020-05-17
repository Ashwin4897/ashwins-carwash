/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class handles user input and provides the factory with an order to build*/
import java.util.ArrayList;
import java.util.Scanner;
public class ARcarwash {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Integer> order;
	
	public ARcarwash() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		order = new ArrayList<Integer>();
		System.out.println("Hello! What type of vehicle have you brought in today?\n"   // to select base order type
				+ "1. Two Wheeler            $15.50\n"
				+ "2. Normal Sized Car       $23.00\n"
				+ "3. Larger Vehicle         $35.50\n");
		int optionSelection = scan.nextInt();
		order.add(optionSelection);
		
		washtype wash = orderfactory.buildOrder(order);
		
		System.out.println("\n\n\nHello! Please Select any Add-Ons you May Like. *Limit 10 add ons per vehicle*\n\n" // to customize order with additional services
				+ "4. Jasmine Scent          $4.50\n"
				+ "5. Rose Scent             $4.00\n"
				+ "6. Tire Shine             $4.50\n"
				+ "7. Foam Polish            $3.50\n"
				+ "8. Rust Inhibitor         $3.00\n"
				+ "9. Spray Wax              $9.50\n"
				+ "10. Undercarriage Wash    $5.50\n"
				+ "11. Hand Wash             $15.00\n"
				+ "12. Hand Dry              $10.00\n"
				+ "13: High Pressure Wash    $2.50\n");
		
		System.out.println("Please add an option, or enter 0 to proceed to checkout.");
		while(order.size() < 11) {                                                                 // to decorate order with additional services
			
			optionSelection = scan.nextInt();                                                  
			if(optionSelection == 0) {                                                             // logic to handle case where multiple instances of an option are added on an order.
				break;                                                                
			} else if(order.contains(4) && optionSelection == 4) {                                 // ensuring that each selection is not made more than once
				System.out.println("You cannot choose the same option twice, please try again!");
			} else if(order.contains(5) && optionSelection == 5) {
				System.out.println("You cannot choose the same option twice, please try again!");
			} else if(order.contains(6) && optionSelection == 6) {
				System.out.println("You cannot choose the same option twice, please try again!");
			} else if(order.contains(7) && optionSelection == 7) {
				System.out.println("You cannot choose the same option twice, please try again!");
			} else if(order.contains(8) && optionSelection == 8) {
				System.out.println("You cannot choose the same option twice, please try again!");
			} else if(order.contains(9) && optionSelection == 9) {
				System.out.println("You cannot choose the same option twice, please try again!");
			} else if(order.contains(10) && optionSelection == 10) {
				System.out.println("You cannot choose the same option twice, please try again!");
			} else if(order.contains(11) && optionSelection == 11) {
				System.out.println("You cannot choose the same option twice, please try again!");
			} else if(order.contains(12) && optionSelection == 12) {
				System.out.println("You cannot choose the same option twice, please try again!");
			} else if(order.contains(4) && optionSelection == 5) {                                 //ensuring user cannot choose both scent options
				
				System.out.println("You cannot choose both Jasmine & Rose scents! Please try again.");
				
			} else if (order.contains(5) && optionSelection == 4) {                                //ensuring user cannot choose both scent options
				
				System.out.println("You cannot choose both Jasmine & Rose scents! Please try again.");
				
			} else {
				order.add(optionSelection);
			}
			
		}
		
		     
		wash = orderfactory.buildOrder(order);
		System.out.println("\n_________________________________________\n\n"
				+ "Thank You for Using AR Premium Carwash! \n\n         "
				+ "Your order is as follows  \n\n" + wash.getDescription() + "\n"
						+ "Subtotal:                         $" + wash.getTotalPrice());
		double roundedTax = Math.round((wash.getTotalPrice() * .08) * 100) / 100.0;
		System.out.println("Tax:                              $" + roundedTax);
		double total = Math.round((wash.getTotalPrice() + roundedTax) * 100) / 100.0;
		System.out.println("\nTotal:                            $" + total + "\n_________________________________________");
		System.out.println("\n\nIs there another vehicle you'd like us to take care of? If so, enter 1.");
		optionSelection = scan.nextInt();
		if(optionSelection == 1) {
			ARcarwash.main(args);
		}
		System.out.println();
		
	}
	
	
	

}
