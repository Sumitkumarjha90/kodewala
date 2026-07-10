package collectionTopic_set1;
import java.util.*;
class Client{
	String name;
	int id;
	
	public Client(String _name,int _id) {
		this.name=_name;
		this.id=_id;
		
	}
	@Override
	public boolean equals(Object obj) {
		Client e=(Client)obj;
		return this.name.equals(e.name) & this.id ==e.id;
		
	}
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.id;
		
	}
}
public class Driver2 {
	public static void main(String args[]) {
		Set<Client> emp=new HashSet<Client>();
		
		Client e1=new Client("Sumit",123);
		Client e2=new Client("Shubham",543);
		Client e3=new Client("Abhi",1876);
		Client e4=new Client("Rahul",1937);
		Client e5=new Client("Sumit",123);
		
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		System.out.println(emp.size());
		
		System.out.println(e1.equals(e5));
//		System.out.println(e3.equals(e5));
		
		
		
	}

}
