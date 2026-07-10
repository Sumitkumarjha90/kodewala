package stringExp;

public class bangloreCompare {
	public static void main(String args[]) {
		
		String s="Sumit";//it store to the String constant pool
		String s1=new String("Sumit");//it will store to the heap
		
		
		
		System.out.println(s==s1);//it will compare the address of the String

		
		System.out.println(s.equals(s1));// it will check the value is same or not
		
		
		System.out.println();
		
	}

}
