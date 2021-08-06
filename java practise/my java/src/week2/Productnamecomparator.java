package week2;

import java.util.Comparator;

public class Productnamecomparator implements Comparator<Product>{
		
		@Override
		public int compare(Product o1,Product o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
}


