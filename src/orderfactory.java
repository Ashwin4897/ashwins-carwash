/*Ashwin Ravi     CPI 221     Professor Selgrad
 * This class receives the order then builds it*/
import java.util.ArrayList;

public class orderfactory {

	public orderfactory() {
			
	}
	
	public static washtype buildOrder(ArrayList<Integer> order) {
		
		int baseWashType = order.get(0);
		washtype customizedWash;
		if(baseWashType == 1) {
			customizedWash = new twowheeler();
		} else if(baseWashType == 2) {
			customizedWash = new car();
		} else if(baseWashType == 3) {
			customizedWash = new largevehicle();
		} else {
			return null;
		}
		
		for(int i = 1; i < order.size(); i++) {
			
			int currentAddOn = order.get(i);
			if(currentAddOn == 4) {
				
				customizedWash = new jasminescent(customizedWash);
				
			} else if(currentAddOn == 5) {
				
				customizedWash = new rosescent(customizedWash);
				
			} else if(currentAddOn == 6) {
				
				customizedWash = new tireshine(customizedWash);
				
			} else if(currentAddOn == 7) {
				
				customizedWash = new polish(customizedWash);
				
			} else if(currentAddOn == 8) {
				
				customizedWash = new rustinhibitor(customizedWash);
				
			} else if(currentAddOn == 9) {
				
				customizedWash = new wax(customizedWash);
				
			} else if(currentAddOn == 10) {
				
				customizedWash = new undercarriage(customizedWash);
				
			} else if(currentAddOn == 11) {
				
				customizedWash = new handwash(customizedWash);
				
			} else if(currentAddOn == 12) {
				
				customizedWash = new handdry(customizedWash);
				
			} else if(currentAddOn == 13) {
				
				customizedWash = new highpressure(customizedWash);
				
			} else {
				
				return null;
				
			}
			
		}
		
		return customizedWash;
		
	}
	
	
	
}
