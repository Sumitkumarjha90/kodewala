package exception1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=100;
		int result=1;
		result=balance/result;
		
		
		try {
			result=balance/result;
		}
		catch(Exception e) {
			e.printStackTrace();
			
			System.out.println("Exception is occur");
		}
		
		try {
		System.out.println("Started the exception of try block ");
		Class.forName("Exception.src.exception.Driver11111");
		System.out.println("Started the exception of try block ");
		
		}
		catch(ClassNotFoundException e) {
			
		
			e.printStackTrace();
			System.out.println("Started the exception of catch block");
		}
		
	}

}
