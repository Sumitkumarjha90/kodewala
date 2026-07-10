package collectionTopic_set;
import java.util.*;


public class Driver {

	public static void main(String[] args) {
		
		Set<String> cities=new HashSet<>();
		
		cities.add("Bangalore");
		cities.add("Bihar");
		cities.add("Bhubaneswer");
		cities.add("Mysore");
		cities.add("Bengal");
		cities.add("Bihar");
		
		System.out.println(cities);
		
		System.out.println(cities.size());
		System.out.println("Bangalore".hashCode());
		System.out.println("Bangalore".hashCode() & 15);
		
		
		

	}

}
