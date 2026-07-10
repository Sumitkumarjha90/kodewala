package stream;
import java.util.*;
import java.util.stream.Collectors;
public class Driver3 {
	public static void main(String args[]) {
		List<List<String>> input=Arrays.asList
				(Arrays.asList("Sumit","Rahul")
						,Arrays.asList("Raj","Abhi","Raman","Rajesh"),
						Arrays.asList("Sai","Suraj","Shubham","Sameer"));
		
		System.out.println("given List"+input);
		List<String> flattenList=input.stream().flatMap(list ->list.stream())
		.collect(Collectors.toList());
		
		System.out.println("after converting using the flatmap "+flattenList);
		
		
		flattenList.stream()
		.filter((word -> word.startsWith("S") && word.length()>4))
		.forEach(w->System.out.println(w));
		
		
		
		
	}

}
