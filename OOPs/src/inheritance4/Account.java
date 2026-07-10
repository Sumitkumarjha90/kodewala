package inheritance4;

public class Account{
	public static void main(String args[] ){
		System.out.println();
	}
	public void openAcc(String details) {
		System.out.println("Open Account ");
		
	}

}

class SavingAccount extends Account{
	
	public void openAcc(String details) {
	
	System.out.println("Saving account :");
	
	}
	
}
class CurrentAccount extends Account{
	public void openAcc(String details) {
		
		System.out.println("Saving account :");
		
		}
}
class Hybrid extends SavingAccount {
	
}