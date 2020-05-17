/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class defines the additional service rose scent to be added to the base menu item*/
public class rosescent extends addondecorator {
	
	public rosescent(washtype type) {
		
		super(type);
		this.description = "  + Rose Scented                  $4.00  |\n";
		this.price += 4.00;
		
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
