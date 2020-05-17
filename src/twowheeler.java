/*Ashwin Ravi     CPI 221     Professor Selgrad
 * abstract class representing smaller size wash type*/
public class twowheeler extends washtype {
	
	public twowheeler() {
		
		this.description = "Base: Two Wheeler Wash            $15.50 |\n";
		this.price = 15.50;
		
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
