package collection_day1_linkedhashset_stream;
import java.util.*;
class Employee{
	String name;
	int salary;
	
	Employee(String _name,int _salary){
		this.name=_name;
		this.salary=_salary;
	}
}

public class Driver12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("raj",5344);
		Employee e2=new Employee("sahil",3000);
		Employee e3=new Employee("suraj",20000);
		Employee e4=new Employee("Shubham",90000);
		Employee e5=new Employee("rahul",10000);
		Employee e6=new Employee("ram",30000);
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		Employee output=list.stream().sorted((a,b)->b.salary-a.salary).skip(1).findFirst().get();
		System.out.println(output.salary + " "+ output.name);
		
		

	}

}
