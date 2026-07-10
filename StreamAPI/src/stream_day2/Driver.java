package stream_day2;
import java.util.*;
import java.util.stream.Collectors;
public class Driver {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList
				(20, 60, 40, 40, 50, 40, 50, 30, 30, 20, 60, 10, 90, 80, 10);
		
		
		//input.stream().distinct().forEach(n -> System.out.print(n+" "));
		List<Integer> output = input.stream().distinct().collect(Collectors.toList());
		System.out.println(output);

	}

}
