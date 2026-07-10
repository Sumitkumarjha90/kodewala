package collectionTopic_set1;
import java.util.*;


class Student{
	String name;
	
	public Student(String _name){
		this.name=_name;
		
		
	}
	@Override
	public int hashCode() {
		return 748937;
	}
}
public class Driver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> set=new HashSet<Student>(64);
		

		Student s1=new Student("1-Rahul");
		Student s2=new Student("2-Shyam");
		Student s3=new Student("3-Abhi");
		Student s4=new Student("4-Suraj");
		Student s5=new Student("5-Shubham");
		Student s6=new Student("6-Sumit");
		Student s7=new Student("7-Raj");
		Student s8=new Student("8-Adarsh");
		Student s9=new Student("9-raman");
		
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		set.add(s8);
		
		
		
		
		System.out.println(set);
		
		
		
		set.add(s9);
		
		System.out.println(set);
		
		
		set.remove(s9);
		set.remove(s8);
		set.remove(s7);
		set.remove(s6);
		set.remove(s5);
		set.remove(s4);
		set.remove(s3);
		
		
		System.out.println(set);
		
		
		
		
		
	}

}
