package stream_practice;

import java.util.*;

public class Driver1 {

	public static void main(String[] args) {
		List<Integer> input=Arrays.asList(1,2,4,5);
		
		int sum=input.stream().filter(n->n%2!=0).reduce(0, (a,b)->a+b);
		
		System.out.println(sum);
		
		Optional<Integer> min=input.stream().min((a,b)->a-b);
		System.out.println(min.get());
		
		Optional<Integer> max=input.stream().max((a,b)->a-b);
		System.out.println(max.get());
		
	}

}
