/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class defines the additional service undercarriage wash to be added to the base menu item*/
public class undercarriage extends addondecorator {
	
	public undercarriage(washtype type) {
		
		super(type);
		this.description = "  + Underbody Cleaned             $5.50  |\n";
		this.price += 5.50;
		
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
