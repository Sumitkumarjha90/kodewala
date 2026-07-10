package collectionTopic_set_treeset_compare;

import java.util.*;

class Employee implements Comparable<Employee> {
	String name;
	int sal;

	public Employee(String _name, int _sal) {

		this.name = _name;
		this.sal = _sal;

	}

	@Override
	public int compareTo(Employee e) {
		
		
		    int result = this.name.compareTo(e.name);

		    if (result == 0) {
		        return Integer.compare(this.sal, e.sal);
		    }

		    return result;
		}

}

public class Driver {

	public static void main(String[] args) {

		Employee e1 = new Employee("Rahul", 100000);
		Employee e2 = new Employee("Abhi", 120000);
		Employee e3 = new Employee("Piyush", 130000);
		Employee e4 = new Employee("Sumit", 1400000);
		Employee e5 = new Employee("Sumit", 100000);

		TreeSet<Employee> ts = new TreeSet<Employee>();

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		for (Employee e : ts) {
			System.out.println(e.name+" and "+ e.sal);
		}
	}
}
