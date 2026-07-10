package encap1;

public class Account {
	private int balance=1000;
	
	
	
	public void deposit(int _amount) {
		if(_amount > 0) {
			balance = balance + _amount;
		}else {
			System.err.println("invalid input");
		}
	}
	public int getBalance() {
		return balance;
		
	}
	

}
class Driver{
	public static void main(String args[]) {
		Account ac = new Account();
		ac.deposit(1200);
		System.out.println(ac.getBalance());
		
		
	}
}
