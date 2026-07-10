package interface6_functional;


@FunctionalInterface
public interface IAdd {
	
	public abstract int add(int a,int b);
}
class Driver1{
	public static void main(String[] args) {
		IAdd cal=(i,j)->i+j;
		
		int sum=cal.add(10, 20);
		
		System.out.println(sum);
	}
}
