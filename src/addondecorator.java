/*Ashwin Ravi     CPI 221     Professor Selgrad
 * abstract class representing base item customization*/
public abstract class addondecorator extends washtype {  // to decorate item with add-ons

	protected washtype baseWash;
	
	public addondecorator(washtype type) {
		
		this.baseWash = type;
		
	}
	
	public abstract String getDescription();
	public abstract double getTotalPrice();

}
