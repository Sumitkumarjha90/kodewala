package interface4_;

interface Vehicle{
	void wheel();
	void colour();

	
	public static void start() {
		System.out.println("It will start the engine of  the vehicle by using key ");
		//System.out.println("Vehicle.start() by key ");
	}
	
	
}
class Car implements Vehicle{
	public void wheel() {
		System.out.println("Car.wheel()");
	}
	public void colour() {
		System.out.println("Car.colour()");
	}
	 public void start() {
		 Vehicle.start();
	 }
	
}
class Bike implements Vehicle{
	public void wheel() {
		System.out.println("Bike.wheel()");
	}
	public void colour() {
		System.out.println("Bike.colour()");
	}
	 public void start() {
		 Vehicle.start();
	 }
	
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.start();
		
		
		Bike b=new Bike();
		
		b.colour();
		
		b.wheel();

	}

}
