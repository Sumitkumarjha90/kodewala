package thread;
import java.util.*;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("hello this is thread "+Thread.currentThread()
		.getName());
		
	}
}
public class Driver {

	public static void main(String[] args) {
		System.out.println("the thread will start from here");
		MyThread t1=new MyThread();
		t1.start();
		
		MyThread t2=new MyThread();
		t2.start();
		System.out.println("the thread will End  here");
		

	}

}
