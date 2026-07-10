package interface2_;




interface IBanking1{
	public void doPay();
	
	public abstract void cancelTnx();
	
	void balance();
	
	default void passBookCheck() {
		System.out.print("check passbook "+true);
	}
}
class HDFC implements IBanking1{
	public void doPay(){
		System.out.println("Do payment ");
	}

	@Override
	public void cancelTnx() {
	System.out.println("Cancel transcation ");
	
	}

	@Override
	public void balance() {
		System.out.print("check balance ");
		
	}
	
}
class RuralBank implements IBanking1{

	@Override
	public void doPay() {
		System.out.println("Do payment ");
	}

	@Override
	public void cancelTnx() {
		System.out.println("cancelTnx happen");
		
	}

	@Override
	public void balance() {
		System.out.println("balance check by rural bank happen");
		
	}
	public void passbookCheck() {
		System.out.println("pass is check only in rural area");
	}
	
}
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC hdfc=new HDFC();
		hdfc.doPay();
		
		hdfc.cancelTnx();
		
		//hdfc.passBookCheck();
		
		RuralBank r=new RuralBank();
		r.passbookCheck();
		

	}

}
