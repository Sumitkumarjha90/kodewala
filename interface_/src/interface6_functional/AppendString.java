package interface6_functional;

public interface AppendString {
	
	String appendString(String s);

}
class Driver3{
	public static void main(String[] args) {
		AppendString app=(name)->(name.toUpperCase());
		
		String s=app.appendString("sumit");
		System.out.print(s);
	}
}
