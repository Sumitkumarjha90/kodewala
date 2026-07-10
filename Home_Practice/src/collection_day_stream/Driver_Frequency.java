package collection_day_stream;
import java.util.Map;

import java.util.stream.Collectors;

public class Driver_Frequency {

	public static void main(String[] args) {
		String name="Abhishek";
		
		long output = name.chars().mapToObj(ch -> (char)ch).count();
		
		System.out.println("counting the char : "+output);
		
		Map<Character,Long> output1=  name.chars().mapToObj(ch -> (char)ch)
		.collect(Collectors.groupingBy(c -> c,Collectors.counting()));
		
		System.out.println("the frequency of the char are : "+output1);
		
		
		
		
		

	}

}
