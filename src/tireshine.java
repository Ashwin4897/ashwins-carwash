/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class defines the additional service tire shine to be added to the base menu item*/
public class tireshine extends addondecorator {
	
	public tireshine(washtype type) {
		
		super(type);
		this.description = "  + Tire Shined                   $4.50  |\n";
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
