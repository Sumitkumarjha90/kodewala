package stream_practice;

import java.util.*;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {

		List<String> input = Arrays.asList
				("Bihar","Delhi","Bangalore","Hydrabad","Mysore","Pune");
		
		Map<Integer,List<String>> output = input.stream().filter(w->w.length()>4)
				.collect(Collectors.groupingBy(w->w.length()));
		
		System.out.println(output);
		
		
		Map<Boolean, List<String>>output1 = input.stream().
				collect(Collectors.partitioningBy(w->w.length()>6));
		
		System.out.println(output1);
	}

}
