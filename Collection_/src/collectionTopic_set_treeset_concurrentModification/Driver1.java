package collectionTopic_set_treeset_concurrentModification;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver1 {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<String>();

		list.add("Sumit");
		list.add("Rahul");
		list.add("Abhi");
		list.add("Aman");
		list.add("Raj");
		
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext()) {
			String element=(String) itr.next();
			
			list.remove("Sumit");
			System.out.println("removing");
			
		}
		System.out.println(list);

	}

}
