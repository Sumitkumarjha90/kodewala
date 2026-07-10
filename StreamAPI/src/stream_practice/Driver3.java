package stream_practice;
import java.util.*;
public class Driver3 {

	public static void main(String[] args) {
		String s = "swiss";
		
		Optional<Character> output = s.chars().mapToObj(c -> (char)c)
		.filter(ch -> s.indexOf(ch) == s.lastIndexOf(ch)).findFirst();
		
		System.out.println("the unique and first character is : "+output.get());
		

	}

}
