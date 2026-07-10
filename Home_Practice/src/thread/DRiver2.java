package thread;


class Cook extends Thread{
	
	public void run() {
		try {
			System.out.println("Cooking food - Started");
			Thread.sleep(2000);
			System.out.println("Cooking food - Ended");
			
		}
		catch(InterruptedException e){
			e.printStackTrace();
			
		}
	}
}

public class DRiver2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("Waiter -Took order and waiting for food cooked");
		Thread.currentThread().setName("waiter");
		 
		Cook cookThread=new Cook();
		cookThread.start();
		cookThread.join();
		System.out.println("Waiter - Start serving");
	}

}
