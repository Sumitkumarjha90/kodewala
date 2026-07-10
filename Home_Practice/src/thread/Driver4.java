package thread;

import java.util.*;

class Task1 {

	public void printEven() {

		synchronized (this) {

			for (int i = 0; i <= 10; i++) {
				if (i % 2 == 0) {
					System.out.println("i is " + i + "and the thread is " + 
				Thread.currentThread().getName());

				}
			}
		}
	}

	public void printOdd() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("i is " + i + "and the thread is " +
			Thread.currentThread().getName());

			}
		}

	}
}

class MyThread3 implements Runnable {

	Task1 task;

	MyThread3(Task1 _task) {
		this.task = _task;

	}

	public void run() {
		System.out.println("this is run the run method" +
	Thread.currentThread().getName());

		task.printEven();

	}
}

public class Driver4 {

	public static void main(String[] args) {
		Task1 task = new Task1();

		MyThread3 myThread = new MyThread3(task);

		Thread t1 = new Thread(myThread);
		t1.start();

		Thread t2 = new Thread(myThread);
		t2.start();

	}

}
