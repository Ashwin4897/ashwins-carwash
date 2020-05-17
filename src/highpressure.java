/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class defines the additional service high pressure wash to be added to the base menu item*/
public class highpressure extends addondecorator {
	
	public highpressure(washtype type) {
		
		super(type);
		this.description = "  + High Pressure Washed          $3.50  |\n";
		this.price += 2.50;
		
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
