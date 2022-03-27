package AZ;
import java.util.*;

class Discount {
	String index;
	int type;
	int value;
	
	Discount(String index, int type, int value) {
		this.index = index;
		this.type = type;
		this.value = value;
	}
}

public class LowestPriceDiscount {

	public static int totalPrice(String[][] products, String[][] discounts) {
		
		HashMap<String, Discount> map = new HashMap<String, Discount>();
		
		for (String[] discount: discounts) {
			int type = Integer.parseInt(discount[1]);
			int value = Integer.parseInt(discount[2]);
			
			map.put(discount[0], new Discount(discount[0], type, value));
		}
		
		int res = 0;
		
		for (String[] product : products) {
			int price = Integer.parseInt(product[0]);
			int min = price;
			
			for (int i = 1; i < product.length; i++) {
				int currPrice = price;
				String index = product[i];
				
				if (!index.equals("EMPTY")) {
					Discount dis = map.get(index);
					
					if (dis.type == 0) {
						currPrice = dis.value;
					} else if (dis.type == 1) {
						currPrice = currPrice - currPrice*dis.value/100;
					} else if (dis.type == 2) {
						currPrice = currPrice - dis.value;
					}
					
					min = Math.min(min, currPrice);
					
				}
			}
			res+= min;
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		String[][] product = { {"10", "d0", "d1" }, {"15", "EMPTY", "EMPTY"}, {"20", "d1", "EMPTY"} };
		String[][] discount = { {"d0", "1", "27"}, {"d1", "2", "5"} };
		
		System.out.println(totalPrice(product, discount));
	}
}
