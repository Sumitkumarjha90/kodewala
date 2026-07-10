package practiceString;

public class ReverseString {
	
	public void reverseString(String name) {
		int n=name.length();
		
		for(int i=n-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ReverseString rev=new ReverseString();
		rev.reverseString("S U M I T");
		

	}

}
