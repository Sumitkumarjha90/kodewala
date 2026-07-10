package stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> brand=Arrays.asList("Sumsung","Redmi"
				,"Oneplus","Apple","Vivo","Nokia");
		
		System.out.println("Input : "+brand);
		
		Stream<String> stream=brand.stream();
		
		Stream<String> upperCaseStream= stream.map(word ->word.toUpperCase());
		
		List<String> processedBrand=upperCaseStream.collect(Collectors.toList());
		
		
		System.out.println("Processed : "+ processedBrand);
		
		

	}

}
