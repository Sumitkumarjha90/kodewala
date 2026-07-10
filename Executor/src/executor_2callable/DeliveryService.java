package executor_2callable;

public class DeliveryService {
	public void confirmDelivery() {

		System.out.println("The Delivery is done " + Thread.currentThread().getName());
	}
}
