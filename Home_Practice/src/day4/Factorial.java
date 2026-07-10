package day4;

public class Factorial {
	public int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		
		return fact;
		
	}
	
}
class Driver{
	public static void main(String[] args) {
		Factorial fact=new Factorial();
		
		System.out.print(fact.factorial(5));
	}
}
