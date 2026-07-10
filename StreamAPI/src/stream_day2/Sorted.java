package stream_day2;
import java.util.*;
import java.util.stream.Collectors;


public class Sorted {

	public static void main(String[] args) {
		
		List<Integer> input=Arrays.asList(10,90,40,50,20,0,49,82,74,98);
		
		
		List<Integer> output = input.stream().sorted().collect(Collectors.toList());
		System.out.println("order is asc");
		
		
		System.out.println(output);
		
		System.out.println("order is desc");
		List<Integer> output1 = input.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		

		System.out.println(output1);
		

	}

}
