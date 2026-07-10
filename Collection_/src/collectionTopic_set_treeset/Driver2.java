package collectionTopic_set_treeset;
import java.util.*;
class Person {
	String name;
	public Person(String _name) {
		this.name=_name;
	}
	
}
public class Driver2 {

	public static void main(String[] args) {
		TreeSet<Person> tSet=new TreeSet<Person>();
		
		Person p1=new Person("Sumit");
		Person p2=new Person("Rahul");
		Person p3=new Person("Abhi");
		Person p4=new Person("Sumit");
		Person p5=new Person("Aman");
		
		tSet.add(p1);
		tSet.add(p2);
		tSet.add(p3);
		tSet.add(p4);
		tSet.add(p5);
		
		System.out.println(tSet);
		
		
		
		
		


	}

}
