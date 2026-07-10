package executor_2callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NotifyDelivery implements Callable<String>{
	public String call() {
		System.out.println("CallableRun method working "+Thread.currentThread().getName());
		DeliveryService delivery=new DeliveryService();
		delivery.confirmDelivery();
		return "Success";
		
	}
}

public class Driver {

	public static void main(String[] args) {
		ExecutorService executorService =Executors.newFixedThreadPool(2);
		
		for(int i=0; i<6; i++) {
			
			NotifyDelivery not=new NotifyDelivery();
			executorService.submit(not);
			
		}
		executorService.shutdown();
		
		
	}

}
