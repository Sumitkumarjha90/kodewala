package stream;
import java.util.*;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {
		List<String> input=Arrays.asList("Bangalore",
				"Banaras","Bhubaneswer","Chennai","Buxar","Mumbai");
		
		List<String> output =input.stream()
				.filter((m->m.startsWith("B") && ( m.length()>6)))
				.collect(Collectors.toList());
		System.out.println(output);

	}

}
