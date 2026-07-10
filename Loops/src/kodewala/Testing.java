package kodewala;

public class Testing {
	
	public void print() {
		System.out.println("NAME : Sumit");
		System.out.println("Insitute : Kodewala ");
		Tests t=new Tests();
		t.student();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hyy");
		Testing test=new Testing();
		test.print();

	}

}
class Tests{
	public void student() {
		System.out.println("Total Student is 450 ");
	}
}

