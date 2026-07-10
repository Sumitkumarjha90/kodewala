package iibSIB;

public class Construc {
	static {
		for(int i=1;i<4;i++) {
			System.out.println(i +"sib");
		}
	}
	public Construc(){
		System.out.println("hello");
	}
	
	{
		System.out.println("inside iib block");
	}
	public static void main(String args[]) {
		System.out.println("INside main block");
		//System.out.println("inside main block");
		Construc con=new Construc();
		
		
		System.out.println("inside main block");
		
		
	}

}
