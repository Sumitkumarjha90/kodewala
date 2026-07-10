package thread;
import java.util.*;

class Task{
	public void taskPerform() {
		for(int i=0;i<10;i++) {
			System.out.println("the value of the i "+i
					+" and the exe "+Thread.currentThread().getName());
		}
	}
}
class MyThread1 implements Runnable{
	Task task;
	MyThread1(Task _task){
		this.task=_task;
		
		
	}
	public void run() {
		System.out.println("Mythread run "+Thread.currentThread().getName());
		task.taskPerform();
	}
}
public class Driver1 {

	public static void main(String[] args) {
		Task task=new Task();
		
		MyThread1 myThread=new MyThread1(task);
		
		Thread t1=new Thread(myThread);
		t1.start();
		
		Thread t2=new Thread(myThread);
		t2.start();
		
		

	}

}
