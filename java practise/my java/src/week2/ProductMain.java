package week2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductMain {
	public static void main(String args[]) {
		List<Product> productlist=new ArrayList<>();
		productlist.add(new Product(100,"Mobile",5000,4.0f,10));
		productlist.add(new Product(105,"Watch",500,2.5f,25));
		productlist.add(new Product(104,"Shoes",1000,3.5f,5));
		productlist.add(new Product(103,"Masks",100,3.5f,40));
		printproductlist(productlist);
		
	Collections.sort(productlist);
	System.out.println("printing based on id");
	printproductlist(productlist);
	
	Collections.sort(productlist, new Productnamecomparator());
	System.out.println("printing based on name");
	printproductlist(productlist);
	
	
	Collections.sort(productlist, (Product p1, Product p2) -> {
		Double d1 = p1.getCost();
		Double d2 = p2.getCost();
		return d1.compareTo(d2);
	});
	printproductlist(productlist);
	
	Collections.sort(productlist, (Product p1,Product p2) -> {
		Float f1=p1.getRating();
		Float f2=p2.getRating();
		int x=f1.compareTo(f2);
		
		return x;
	});
	System.out.println("Printing  based on Rating");
	printproductlist(productlist); 
	
	productlist.stream().filter(e ->e.getRating()>=0).collect(Collectors.toList()).forEach(System.out::println);
		
	}
	public static void printproductlist(List<Product> productlist) {
		for(Product p: productlist) {
			System.out.println(p);
			
		}
	}
	

}
