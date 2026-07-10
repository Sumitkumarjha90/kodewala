package collectionTopic_set_treeset_comparator;

import java.util.Comparator;

public class firstComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1,Employee o2) {
		return o1.firstName.compareTo(o2.firstName);
		
	}
	

}
