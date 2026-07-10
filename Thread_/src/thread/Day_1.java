package thread;

 class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}
 class MyThread2 implements Runnable{
	 
	 @Override
	 public void run() {
		 
		 System.out.println("MyThread2 will work : "+Thread.currentThread().getName());
	 }
 }

public class Day_1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hello EveryOne");
		
//		MyThread m1=new MyThread();
//		m1.setName("T1");
//		
//		m1.start();
		MyThread m1 = new MyThread();
		
		m1.run();
		
		
		
		MyThread m2 = new MyThread();
		m2.setName("mythread");
		m2.start();
		

	}

}
