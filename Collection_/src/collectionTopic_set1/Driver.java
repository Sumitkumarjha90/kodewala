package collectionTopic_set1;
import java.util.*;

class Employee{
	private  String empId;
	
	public Employee(String _empId) {
		super();
		this.empId=_empId;
		
	}
	
	
	@Override
	public boolean equals(Object obj2) {
		Employee e2=(Employee)obj2;
		return this.empId.equals(e2.empId);
	}
	@Override
	public  int hashCode() {
		return this.empId.hashCode();
		
	}	
}
public class Driver {

	public static void main(String[] args) {
		
		String s1="Sum12";
		String s2=new String("Sum12");
		
		System.out.println(s1.hashCode() +" and "+s2.hashCode()+"  "
		+s1.equals(s2));

		Employee e1=new Employee("Rahul12");
		Employee e2=new Employee("Abhi12");
		
		
		System.out.println(e1.hashCode()+" "+e2.hashCode()
		+" is equal : "+e1.equals(e2));
		
	}

}
