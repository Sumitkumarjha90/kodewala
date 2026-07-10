package inheritance1;

public class Phonepay extends Payment{
	public void phonepay() {
		
		
		payment(1000 );
		System.out.println("done by phonepay");
		
		
	}
	
}
 class Gpay extends Payment{
	 
	public void gPay() {
		//payment(1500 , 500);
	}
	
}
class CreditCard extends Payment{
	//public void creditCard() {
		//payment(10000 , 2000);
	//}
}
class NetBanking extends Payment{
	public void creditCard() {
		//payment(150000 , 12000);
	}
}
class PaymentDone {
	public static void main(String args[]) {
		NetBanking net = new NetBanking();
		
		
		//net.creditCard();
		CreditCard cred=new CreditCard();
		
		System.out.print("this is pay by the credit card");
		cred.payment(100);
		
		System.out.print("this is pay by the net banking");
		net.payment(100000);
		
		//net.sendmail();
		
	}
	
}
