/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class defines the additional service spray wax to be added to the base menu item*/
public class wax extends addondecorator {
	
	public wax(washtype type) {
		
		super(type);
		this.description = "  + Spray Waxed                   $9.50  |\n";
		this.price += 9.50;
		
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
