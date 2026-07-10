package executor_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NotifyDelivery implements Runnable {
	@Override
	public void run() {
		
		System.out.println("NotifyDelivery_run method  : "+Thread.currentThread().getName());
		DeliveryService delivery = new DeliveryService();

		delivery.confirmDelivery();
		
	}

}

public class Driver {

	public static void main(String[] args) {

	//	ExecutorService executorService = Executors.newCachedThreadPool();//dynamic thread
	//	ExecutorService executorService = Executors.newSingleThreadExecutor();//single thread
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for(int i=0; i<5; i++) {
			NotifyDelivery notify = new NotifyDelivery();
			executorService.execute(notify);
		}
		executorService.shutdown();

	}

}
