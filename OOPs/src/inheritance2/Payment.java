package inheritance2;

public class Payment {
	public void pay() {
		System.out.println("doing payment");
	}

}
class Phonepay extends Payment{
	public void pay() {
		System.out.println("doing phonepay payment");
	}
}
class GPay extends Payment{
	public void pay() {
		System.out.println("doing Gpay payment ");
	}
	public static void main(String args[]) {
		GPay gpay=new GPay();
		gpay.pay();
	}
	
}

