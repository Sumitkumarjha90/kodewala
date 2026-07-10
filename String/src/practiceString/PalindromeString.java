package practiceString;

public class PalindromeString {
	public void rev() {
		String name="MAM";
		String rev="";
		
		String original=name;
		int n=name.length();
		for(int i=n-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
			
			
			
		}
		if(original.equals(rev)) {
			System.out.println("this is palindrome ");
		}else {
			System.out.println("this is not plaindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeString  palindrome=new PalindromeString();
		palindrome.rev();
		
		
		

	}

}
