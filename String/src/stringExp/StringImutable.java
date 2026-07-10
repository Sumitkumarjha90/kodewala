package stringExp;

public class StringImutable {
	
	
	public static void main(String[] args) {
		
		
	
		String name = "Sumit ";
		String lastName = "jha";
		String name1 = new String("Sumit ");
		
		String n = name.concat(lastName);// adding the String (name to lastName )to check it is mutable or not
		
		String n1 = "Sumit Jha";
		
		
		
		System.out.println("check the String is in Same address or not : "+(n==n1));
		
		System.out.println(name==name1);// check the address of the object
		

		System.out.println(name1.equals(name));//check the content of the string
		
		
		System.out.println(name);// printing the string to check whether it modified or not 
		
		
		
		String s = " Darbhanga"+" Bihar"+" Indian ";
		String s1 = n1 + s;
		String s2 = s1.intern();
		
		System.out.println(s1 == s2);
		
		System.out.println("print the Address  : " + s1);
		
		System.out.println("print the Address  : " + s);
		
		
		Obj obj = new Obj();
		
		String n5 = new String("Sum");
		
		
		
		
		

	}

}
class Obj{
	Obj(){
		System.out.println("hello");
	}
	
	public void m1(String s) {
		
		
		
	}
}
