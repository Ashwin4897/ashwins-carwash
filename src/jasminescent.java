/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class defines the additional service jasmine scent to be added to the base menu item*/
public class jasminescent extends addondecorator {
	
	public jasminescent(washtype type) {
		
		super(type);
		this.description = "  + Jasmine Scented               $4.50  |\n";
		this.price += 4.50;
		
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
