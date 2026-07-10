package stream_day2;

import java.util.*;


public class Max {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(200,700,4000,600,900,2000,6000);
		
		Integer output = input.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst().get();
		
		//System.out.println(output);
		
		Integer s = input.stream().distinct().skip(1).max((a,b)-> a-b).get();
		System.out.println(s);
		
		
		
		
		

	}

}
