package thread_day2;

class MyThread implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println("Run method of Mythread");
		
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread=new MyThread();
		
		Thread t1=new Thread(myThread);
		t1.start();
		

	}

}
