/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class defines the additional service polish to be added to the base menu item*/
public class polish extends addondecorator {
	
	public polish(washtype type) {
		
		super(type);
		this.description = "  + Foam Polished                 $3.50  |\n";
		this.price += 3.50;
		
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