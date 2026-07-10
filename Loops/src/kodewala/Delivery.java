package kodewala;

public class Delivery {
	String customerName;
	String itemName;
	String  delDate;
	
	Delivery(){
		System.out.println("This will print the default value  ");
		System.out.println(customerName);
		System.out.println(itemName);
		System.out.println(delDate);
	}
	Delivery(String _customerName,	String _itemName,String  _delDate){
		System.out.println("This will print the parameter Constructor ");
		System.out.println(_customerName);
		System.out.println(_itemName);
		System.out.println(_delDate);
	}
	
	

	

} 
class Deli{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delivery person=new Delivery();
		
		Delivery person1=new Delivery("Rahul ","Protien ","21-10-2026");
		Delivery person2=new Delivery("Avibhesk ","Protien ","25-10-2026");
		Delivery person3=new Delivery("Sumit","Sports_Bike ","22-10-2026");

	}
}
