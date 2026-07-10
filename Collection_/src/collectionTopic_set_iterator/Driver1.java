package collectionTopic_set_iterator;
import java.util.*;
import java.util.HashSet;

public class Driver1 {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		
		
		set.add("Sumit");
		set.add("Suman");
		set.add("Abhi");
		set.add("Avi");
		set.add("Rahul");
		
		for(String element : set)
		{
			
			if(element.startsWith("A")) {
				System.out.println(element);
			}
		}
		
		
		System.out.println("Using iterator ");
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext()) {
			String element=itr.next();
			if(element.startsWith("A")) {
				System.out.println(element);
			}
		}
		

	}

}
