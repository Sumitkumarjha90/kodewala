package inheritance;

public class Engine {
	int TypeBike = 3;
	
	public void twoCylinder() {
		System.out.print("This is for bike TwoCylinder Engine");
		
	}
	
	public void fourCylinder() {
		System.out.println("this is for fourcylinder");
	}
	public void threeCylinder() {
		System.out.println("this is for three Cylinder ");
	}
	

}
class Bike extends Engine{
	
	public static void main(String args[]) {
			
	Bike b = new Bike();
	
	System.out.println(b.TypeBike);
	
	b.fourCylinder();
	
	b.threeCylinder();
	
	b.twoCylinder();
	
	
	
	}
}