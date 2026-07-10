package collectionTopic_set1;

import java.util.HashSet;

public class Driver3 {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>(16);
		
		
		set.add("A1");
		set.add("A2");
		set.add("A3");
		set.add("A4");
		set.add("A5");
		set.add("A6");
		set.add("A7");
		set.add("A8");
		set.add("A9");
		set.add("A10");
		set.add("A11");
		set.add("A12");
		
		System.out.println(set);
		
		set.add("A1");
		
		set.add("A13");
		
		System.out.println(set);
	}

}
