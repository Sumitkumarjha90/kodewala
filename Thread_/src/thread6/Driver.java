package thread6;

public class Driver {

	public static void main(String[] args) {
		
		Task task =new Task();
		
		Producer p=new Producer(task);
		p.setName("Producer");
		
		p.start();
		
		Consumer c=new Consumer(task);
		p.setName("Consumer");
		
		c.start();

	}

}
