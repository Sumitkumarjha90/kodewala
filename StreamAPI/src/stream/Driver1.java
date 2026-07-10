package stream;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Driver1 {

	public static void main(String[] args) {
	List<String> name=Arrays.asList("Ajay","Abhi","Rahul"
			,"Raj","Adarsh","Shyam","Sumit");
	
	List<String> filterName = name.stream()
			.filter(w -> w.startsWith("S")).map(n -> n.toUpperCase())
			.collect(Collectors.toList());
	
			
		System.out.println(filterName);
	}

}
