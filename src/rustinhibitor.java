/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class defines the additional service rust inhibitor to be added to the base menu item*/
public class rustinhibitor extends addondecorator {
	
	public rustinhibitor(washtype type) {
		
		super(type);
		this.description = "  + Rust Blocked                  $3.00  |\n";
		this.price += 3.00;
		
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