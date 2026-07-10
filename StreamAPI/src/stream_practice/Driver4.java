package stream_practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver4 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,20,30,41,43,20,30);
		
		List<Integer> list2 = Arrays.asList(70,60,40,80,90,20,30);
		
		
		
		
		List <Integer> output = Stream.concat(list1.stream(), list2.stream())
				.filter(n-> n%2!=0)
						.distinct().collect(Collectors.toList());
		
		System.out.println(output);
		
	}

}
