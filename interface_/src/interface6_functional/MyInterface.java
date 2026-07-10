package interface6_functional;

@FunctionalInterface
public interface MyInterface {
	//void main();
	public abstract boolean evenOrNot(); 
	default void Odd() {
		
	}

}
class Driver implements MyInterface{
	
	public boolean evenOrNot() {
		int num=10;
		if(num%2==0) {
			return true;
			
		}
		return false;
	}
public static void main(String args[]) {
		Driver d=new Driver();
		boolean b=d.evenOrNot();
		System.out.println("the given number is :"+ b);
		
		
		
	}
}
