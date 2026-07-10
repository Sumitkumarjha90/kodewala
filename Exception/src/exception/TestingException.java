package exception;

public class TestingException {
	public static void main(String[] args) {

		
		int balance=100;
		
		System.out.println("Program will start");
		System.out.println("balance is : "+balance);
		int value=0;
		try {
			
			System.out.println(balance/value);
			String name=null;//NullPointerException
			
			int amount=100;
			
			System.out.println(name.length());//NullPointerException
			
			
			
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Name is null .... ");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("divided by zero");
		}
		System.out.println("Program will End ");
	}

}
