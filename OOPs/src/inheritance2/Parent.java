package inheritance2;

public class Parent{
	public void marryTo() {
		System.out.println("you will marry  Sita");
	}

}
class Child extends Parent{
	public void marryTo() {
		System.out.println(" i will marry sona");
	}
	
	public static void main(String args[]) {
		Child ch=new Child();
		ch.marryTo();
	}
}
