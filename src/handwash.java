/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class defines the additional service hand wash to be added to the base menu item*/
public class handwash extends addondecorator {
	
	public handwash(washtype type) {
		
		super(type);
		this.description = "  + Hand Washed                   $15.00 |\n";
		this.price += 15.00;
		
	}
	
	@Override
	public String getDescription() {
		
		return this.description + "" + this.baseWash.getDescription();
		
	}
	
	@Override
	public double getTotalPrice() {
		
		return this.price + this.baseWash.getTotalPrice();
		
	}
	
}
