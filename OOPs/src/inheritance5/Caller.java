package inheritance5;

class Course {
	public void subject(String name) {
		
		System.out.println("String name");
	}
	
	public void subject(String name,String timeToComplte,double fee) {
		
		System.out.println("String name,string time,double fee");
	}
	
	public void subject(String name,String timeToComplte) {
		
		System.out.println("String name,String time");
	}
	


}
public class Caller{
	public static void main(String args[]) {
		Course course=new Course();
		
		course.subject("java");
	}
}
