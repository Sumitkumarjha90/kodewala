package exception1;

public class TestingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = null;

		int balance = 1000;
		int result = 0;
		try {
			System.out.println(balance / result);
			System.out.println("print the result  ");
			
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("ArithmeticException  is occur ");
		}
		
		try {
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(0));
		}
	}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointerException is occur");
			
		}

	}

}
