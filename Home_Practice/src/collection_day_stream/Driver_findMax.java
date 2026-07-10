package collection_day_stream;

import java.util.*;
import java.util.Arrays;

public class Driver_findMax {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 34, 54, 23, 54, 44, 19, 33, 32);
		
		
		System.out.println("this is not a correct way to find the maxing value");
		
		//list.stream().distinct().sorted((a,b)-> b-a);
		Integer s=	list.stream().sorted((a,b)-> b-a).findFirst().get();
		
		System.out.println(s);
		//list.stream().sorted((a,b)-> a-b).forEach(a -> System.out.println(a));
		
		System.out.println("this will provide you the  maxing value this is direct way");
		
		long s1=list.stream().max((a,b)->a-b).get();
		
		System.out.println(s1);
		
	
	}

}
