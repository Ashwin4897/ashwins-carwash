/*Ashwin Ravi     CPI 221     Professor Selgrad
* abstract class representing larger size  vehicle wash type*/
public class largevehicle extends washtype {
	
	public largevehicle() {
		
		this.description = "Base: Larger Vehicle Wash         $35.50 |\n";
		this.price = 35.50;
		
	}
	
	@Override
	public String getDescription() {
		
		return this.description;
		
	}
	
	@Override
	public double getTotalPrice() {
		
		return this.price;
		
	}
}