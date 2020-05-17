/*Ashwin Ravi     CPI 221     Professor Selgrad
 * abstract class representing standard size vehicle wash type*/
public class car extends washtype {
	
	public car() {
		
		this.description = "Base: Normal Sized Car Wash       $23.00 |\n";
		this.price = 23.00;
		
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