package thread8;

import java.util.concurrent.Callable; //java opt memmory mangagement to chnge the heap storage
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class EmailSender extends Thread{
	public void run() {
		System.out.println("this run method will not return and not give any exception");
		
	}
}
class EmailSenders implements Callable<String>
{
	@Override
	public String call() {
		System.out.println(Thread.currentThread().getName());
		return "Failed   .....";
		
	}
}

public class Driver {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es= Executors.newFixedThreadPool(8);
		EmailSenders task =new EmailSenders();
		
		for(int i=0; i<5;i++) {
		
		Future<String> response =es.submit(task);
		
		System.out.println("Response from the call() is "+response.get());
		}
		es.shutdown();
	}
	

}
