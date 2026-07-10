package day3;

 class Palindrome {
	public void palindrome(int num) {
		int original = num;
		int rev=0;
		while(num>0) {
			int last = num % 10;
			rev = rev * 10 + last;
			num = num / 10;
			
		}
		if(rev==original) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
class PrintPalin{
	public static void main(String args[]) {
		Palindrome palin =new Palindrome();
		
		palin.palindrome(121221);
	}
}