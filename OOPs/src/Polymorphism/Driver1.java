package Polymorphism;

class Delivery{
	public void doDelivery() {
		System.out.println("Dodelivery by delivery");
	}
}
class EComDelivery extends Delivery{
	public void doDelivery() {
		System.out.println("Dodelivery by ecomdelivery");
	}
}

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Delivery eCom= new EComDelivery();
		
		eCom.doDelivery();

	}

}
