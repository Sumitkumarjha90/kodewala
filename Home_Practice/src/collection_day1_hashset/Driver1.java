package collection_day1_hashset;
import java.util.*;
public class Driver1 {
	
	public static void main(String args[]) {
		HashSet<Employee> hashSet=new HashSet<>();
		Employee e1=new Employee("name");
		Employee e2=new Employee("a");
		Employee e3=new Employee("na");
		Employee e4=new Employee("nam");
		Employee e5=new Employee("nae");
		Employee e6=new Employee("nme");
		Employee e7=new Employee("me");
		Employee e8=new Employee("ne");
		Employee e9=new Employee("e");
		Employee e10=new Employee("ae");
		Employee e11=new Employee("v");
		Employee e12=new Employee("x");
		Employee e13=new Employee("d");
		
		
		
		
		
		 	hashSet.add(e1);
	        hashSet.add(e2);
	        
	        
	        hashSet.add(e3);
	        hashSet.add(e4);
	        hashSet.add(e5);
	        hashSet.add(e6);
	        hashSet.add(e7);
	        hashSet.add(e8);
	        hashSet.add(e9);
	        hashSet.add(e10);
	        hashSet.add(e11);
	        hashSet.add(e12);
	        hashSet.add(e13);
	        System.out.println(hashSet.size());
	        
	        System.out.println(hashSet);
		
		
	}

}
class Employee{
	String name;
	public Employee(String _name) {
		this.name=_name;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	public boolean equals(Object obj) {
		Employee e1=(Employee)obj;
		return this.name.equals(e1.name);
	}
}