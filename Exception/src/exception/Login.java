package exception;

public class Login {

    String user = "@sumit";
    String passWord = "123@sum";

    public static void main(String[] args) {

        try {

            Login log = null;

            System.out.println(log.user);

        } 
        catch (NullPointerException e) {
        	
        	e.printStackTrace();
        	
            System.out.println(" NullPointerException  Occurred");
        }

        
        try {

            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);

        } catch (ArithmeticException e) {
        	
        	e.printStackTrace();
        	
            System.out.println(" ArithmeticException  Occurred");
        }
    }
}

class BankInfo {

    public void balance(int balance) {

        System.out.println("Balance: " + balance);
    }
}