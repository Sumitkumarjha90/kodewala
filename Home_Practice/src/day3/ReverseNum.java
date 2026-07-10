package day3;

class Reverse{
	
	public void reverse(int num) {
		int rev=0;
		while(num > 0){
			int last = num % 10;
			rev=rev * 10 + last;
			num=num/10;
			
		}
		System.out.println(rev);
	}
}
public class ReverseNum {
	public static void main(String args[]) {
		Reverse rev=new Reverse();
		rev.reverse(1234);
	}

}
