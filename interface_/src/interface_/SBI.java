package interface_;

public class SBI implements IBanking {
	
	@Override
	public void pay() {
		System.out.print(true+" this is pay");
	}
	@Override
	public void withdraw() {
		System.out.println(true+" this id withdraw");
	}
	public void deposit() {
		System.out.println("the amount is deposit "+ true);
		
	}
	public static void main(String args[]) {
		SBI sbi=new SBI();
		sbi.pay();
	}
}
