package thread_day2;

class MyThread4 extends Thread {

	@Override
	public void run() {

		System.out.println("thread of run method ");

		for (int i = 0; i < 10; i++) {

			System.out.println("Number " + i + " " + Thread.currentThread().getName());

			if (i == 5) {
				System.out.println("sending " + Thread.currentThread().getName() + " tp sleeping/waiting state");

				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
				System.out.println("sleep time over... starting excuting again ");
			}
		}

	}
}

public class Driver2 {

	public static void main(String[] args) {
		MyThread4 myThread = new MyThread4();

		Thread t1 = new Thread(myThread); /* whenever you are using implements then you have to create the new thread */

		myThread.run();

	}

}
