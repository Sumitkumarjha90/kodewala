package thread;

class Mythread3 extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			
			System.out.println("MyThread.run method : "+ i +" "+Thread.currentThread().getName());
		}
		
	}
}

public class Driver{

	public static void main(String[] args) {
		
		Mythread3 m1=new Mythread3();
		
		m1.start();
		
		
		Mythread3 m2=new Mythread3();
		m2.start();
		
		
		
		
	}

}
