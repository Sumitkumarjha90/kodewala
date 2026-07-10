package abstraction;

public class ATM {
	public boolean doLogin(String atm,int pin) {
		System.out.println("Do login by and do some process");
		
		withdraw(1000,200);
		
		deposit(1000,200);
		
		chngePIN("112233");
		
		
		
		return true;
	}
	private void withdraw(int amount,int balance) {
		
		if(amount >balance) {
			
		System.out.println("withdraw is done ");
		System.out.println();
	}
	}
	private void deposit(int amount,int deposit) {
		
		deposit += amount;
		
		System.out.println("deposit is done ");
		System.out.println();
	}
	
	private boolean chngePIN(String newPIN) {
		
		System.out.println("Pin is Updated");
		System.out.println();
		
		return true;
	}

}
