package Polymorphism1;

public class Account {
	
	public void createAccount(String mobile,String Adhaar) {
		
		System.out.println("created the account by (String mobile,String Adhaar)");
	}
	
	public void createAccount(String pancard ,int otp) {
		
		System.out.println("created the account by (String pan,int otp)");
	}
	
	public void createAccount(String mobile) {
		
		System.out.println("created the account by(String mobile");
	}


}
class Driver{
	public static void main(String args[]) {
		Account account=new Account();
		
		account.createAccount("6278282929");
		
		account.createAccount("6278282929",92728);
		
		account.createAccount("6278282929","5353-3636-7376");
		
	}
}
