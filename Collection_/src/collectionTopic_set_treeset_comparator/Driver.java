package collectionTopic_set_treeset_comparator;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Rahul","Kumar");
		Employee e2=new Employee("Shubham","Singh");
		Employee e3=new Employee("Sumit","Kumar");
		Employee e4=new Employee("Abhi","Ranjan");
		
		TreeSet<Employee> ts=new TreeSet<Employee>(new firstComparator());
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		
		for(Employee e : ts){
			System.out.println(e.firstName+" "+e.lastName);
			
		}
		

	}

}
