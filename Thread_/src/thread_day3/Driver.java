package thread_day3;


class BikeRide  extends Thread
{
	@Override
	public void run() {
		
		System.out.println("wearing gear ::"+Thread.currentThread().getName());
		
		try {
		sleep(5000);
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Friends were ready ::"+Thread.currentThread().getName());
		
		
	}
}

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().setName("Friend  ");
		
		System.out.println("Friends pick the call ::"+Thread.currentThread().getName());
		
		
		BikeRide  b1=new BikeRide();
		
		b1.setName("Myself ");
		b1.start();
		b1.join();
		System.out.println("all are ready to go out ::"+Thread.currentThread().getName());
		
		
		
		

	}

}
