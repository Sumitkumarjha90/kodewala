package iibSIB;

public class EmployeeId {
	public static void main(String args[]) {
		EmployeNameID emp=new EmployeNameID("Sumit ","Kodewale1");
		System.out.println();
		EmployeNameID emp1=new EmployeNameID("Rahul " ,"Kodewale2");
		System.out.println();
		EmployeNameID emp2=new EmployeNameID("Abhishek ","Kodewale3");
		System.out.println();
		EmployeNameID emp3=new EmployeNameID("Suraj ","Kodewale4");
		
		
		
		
	}

}
class EmployeNameID{
	static int count;
	String id;

	public String name;
	public EmployeNameID(String name ,String id){
		this.name=name;
		this.id=id;
		//System.out.print(name);
	}
	
	{
		count =count+1;
		
		
	}
	
}
