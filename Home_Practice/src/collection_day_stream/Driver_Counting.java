package collection_day_stream;
import java.util.*;
import java.util.stream.Collectors;
public class Driver_Counting {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(20,14,21,44,56,67,77,9);
		
		long output = list.stream().collect(Collectors.counting());
		System.out.println(output);
		
		Map<Boolean ,List<Integer>> map=list.stream()
				.collect(Collectors.partitioningBy(n-> n%2==0));
		System.out.println(map);
		
		List<String> input=Arrays.asList("mumbai","bombay","delhi","bangalore","bihar");
		
		Map<Boolean,List<String>> map1=input.stream()
				.collect(Collectors.partitioningBy(w ->w.startsWith("b")));
		System.out.println(map1);
	}

}
