package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Busmain {
	public static void main(String[] args) {

		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		float avgBusrating=busList.stream().filter(e->e.getProviderName().equals("Xyz Travels")).map(e->e.getRating()).reduce(0.0f,(sum,e)->sum+e);
		float count=busList.stream().filter(e->e.getProviderName().equals("Xyz Travels")).count();
		System.out.println("The  Average bus rating of Xyz Travels"+avgBusrating/count);
		
		double min1=busList.stream().filter(e->e.getProviderName().equals("Xyz Travels")).map(e->e.getCost()).reduce(Double.MAX_VALUE,(min,cost)-> Math.min(min, cost));
		System.out.println("The minimum price between the xyz travels "+min1);
		
		Map<Integer, Bus> busmap=busList.stream().collect(Collectors.toMap(Bus::getId,Function.identity()));
		
		
		for(Bus b:busmap.values())
		System.out.println(b);

	}
}
