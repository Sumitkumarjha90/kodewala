package thread;

class Task4{
	
	
	
	public synchronized void doSome() throws InterruptedException{
		
		
		for(int i=0;i<10;i++) {
			System.out.println("working the task"+Thread.currentThread().getName());
			//Thread.sleep(1000);
			wait(1000);
		}
	}
}
class MyThread4 extends Thread{
	
	private Task4 task;
	@Override
	public void run() {
		try {
			task.doSome();
			
			
		}catch(InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
	}
	public MyThread4(Task4 _task) {
		this.task=_task;
	}
}

public class Driver5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 m1=new MyThread4(new Task4());
		m1.start();

	}

}
