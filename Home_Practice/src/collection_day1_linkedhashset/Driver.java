package collection_day1_linkedhashset;

import java.util.*;

class Employee implements Comparable<Employee>{
	String name;

	public Employee(String _name) {
		this.name = _name;
	}
	@Override
	public int compareTo(Employee o) {
		
		int result=this.name.compareTo(o.name);
		System.out.println("result is "+ result);
		
		return result;
		
	}
}

public class Driver {
	public static void main(String ars[]) {
		Set<Employee> set = new TreeSet<Employee>();

		set.add(new Employee("ab"));
		set.add(new Employee("cb"));
		set.add(new Employee("bc"));
		set.add(new Employee("b"));
		set.add(new Employee("a"));
		set.add(new Employee("ab"));
		set.add(new Employee("a"));
		
		

		System.out.println(set.size());
		for(Employee e:set) {
			System.out.println(e.name);
		}

	}

}
