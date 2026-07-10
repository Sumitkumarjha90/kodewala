package array;

public class ArrayDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArray print=new PrintArray();
		print.studentInfo();
	
	}

}
class PrintArray{
	public void studentInfo() {
		//int []studentMarks= new int[3];
		String []studentName= new String[3];
//		studentMarks[0]=46;
//		studentMarks[1]=46;
//		studentMarks[2]=46;
//		studentMarks[3]=46;
//		
		
		studentName[0]="Sumit";
		studentName[1]="Suraj";
		studentName[2]="Abhi";
		//studentName[3]="rahul";
		
		
		
		System.out.println("Print the name of the Student");
		
		for(int i=0;i<studentName.length;i++) {
			
			
			System.out.println(studentName[i]);
			
		}
		
		
		
	}
}

