package kodewala;

public class BasicConstr {
	public static void main(String args[]) {
		Constructor cons0=new Constructor();
		
		Constructor cons1=new Constructor(1000,"Online Order food ");
		
		System.out.println("type of "+cons1.type);
		System.out.println("Amount value is "+cons1.amount);
		
		
	}
	

}
class Constructor{
	int amount;
	String type;
	
	
	Constructor(){
		System.out.println("Constructor is calling :");
		
	}
	
	Constructor(int _amount ,String _type){
		this.amount=_amount;
		this.type=_type;
		System.out.println("Second constructor is calling :");
		
	}
	
}

