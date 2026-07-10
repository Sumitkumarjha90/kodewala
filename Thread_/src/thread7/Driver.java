package thread7;

class MyThread extends Thread {

	@Override
	public void run() {
		
		System.out.println("the Thread is  start " + Thread.currentThread().getName());
		Thread.yield();
		System.out.println("THe Thread is end " + Thread.currentThread().getName());

	}
}

public class Driver {

	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		m1.setName("Sumit");

		m1.start();

		MyThread m2 = new MyThread();
		m2.setName("Rahul");
		m2.start();

	}

}
