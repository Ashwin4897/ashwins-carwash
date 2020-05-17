/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class defines the additional service hand dry to be added to the base menu item*/
public class handdry extends addondecorator {
	
	public handdry(washtype type) {
		
		super(type);
		this.description = "  + Hand Dryed                    $10.00 |\n";
		this.price += 10.00;
		
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
