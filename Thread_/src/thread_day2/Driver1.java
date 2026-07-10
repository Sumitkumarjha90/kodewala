package thread_day2;

class MyThread1 implements Runnable{  // implementing runnable interface 
	
	
	@Override                 // Overriding the run method  of runnable interface
	public void run() {       //ready to run 
		
		System.out.println("run method of MyThread  to start ");
		
		
		
		
		System.out.println("run method of MyThread  ");
		System.out.println("run method of MyThread  ");
		System.out.println("run method of MyThread  ");
		
	}
	//once run method is completed your thread t1 is terminated/dead.
}

public class Driver1 {

	public static void main(String[] args) {
	
		MyThread1 myThread = new MyThread1();
		
		Thread t1=new Thread(myThread); // new thread is created 
		t1.start();  // thread move to born state to   Runnable state. 
		
		

	}

}
