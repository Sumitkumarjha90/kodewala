package thread6;

public class Task {

	int num;
	boolean isDataAvailable = false;

	public synchronized void producer(int _num) throws InterruptedException {
		while (isDataAvailable) {
			System.out.println(Thread.currentThread().getName() + " is waiting...");
			wait();

		}
		num = _num;
		System.out.println("Producing data: " + num);
		isDataAvailable = true;
		notify();

	}

	public synchronized void consume() throws InterruptedException {
		while (!isDataAvailable) {
			System.out.println(Thread.currentThread().getName() + " is waiting...");
			wait();

		}

		System.out.println("Consuming it : " + num);
		isDataAvailable = false;
		notify();

	}

}
