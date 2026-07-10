package constructor;

public class ExploreCons {
	
	public static void main(String args[]) {
		
		Construct con=new Construct();
		Construct con1=new Construct("Sumit",638383833);
		Construct con2=new Construct("Sumit",747446474,"java");
		
		
	}

}
class Construct{
	String name;
	long number;
	String subject;
	int marks;
	char grade;
	
	
	Construct(){
		
	}
	Construct(String _name,long _number){
		this.name=_name;
		this.number=_number;
		
	}
	Construct(String _name,long _number,String _subject){
		this.name=_name;
		this.number=_number;
		
		this.subject=_subject;
		
	}


}
