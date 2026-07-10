package inheritance1;


public class Payment {
	private int balance=1000;
	public void payment(int pay) {
		
		if(balance >= pay) {
			
			System.out.println("payment has been done ");
			
		}else {
			System.out.println("Insufficient balance");
		}
		
	}
	public void sendmail() {
		System.out.println("payment is done");
	}
	public void connectToBank() {
		
	}

	
}
