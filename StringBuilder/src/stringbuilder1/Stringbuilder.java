package stringbuilder1;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("hello");
		StringBuilder sb1 = sb.append("world");
		
		System.out.println( sb);
		System.out.println(sb == sb1);
		

	}

}
