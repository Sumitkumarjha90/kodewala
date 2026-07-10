package stream_practice;

import java.util.*;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(20,49,55,67,89,22,45,68,98);
		
		long output=list.stream().distinct().filter(n->n%2==0)
				.sorted((a,b)->b-a).skip(2).findFirst().get();
		
		System.out.println(output);
		

	}

}
