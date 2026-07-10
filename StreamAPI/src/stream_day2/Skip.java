package stream_day2;
import java.util.*;
public class Skip {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(10,30,40,50,50,30);
		
		
		//thsi will skip the first element of the list
		input.stream().skip(1).forEach(n->System.out.println(n+" "));
		
		//it will provide you the first element of list
		Integer n = input.stream().findFirst().get();
		
		System.out.println(n);
		
		Integer n1 = input.stream().findAny().get();
		/* it will provide you any element of 
		the list but always providing the first element */
		
		System.out.println(n1);

	}

}
