package day3;

class Count{
	public void countDigit(int num) {
		int count=0;
		while(num > 0) {
			count=count+1;
			
			num = num / 10;
			
		}
		System.out.println(count);
	}
}
public class CountDigit {
	public static void main(String args[]) {
		Count count=new Count();
		count.countDigit(28937);
	}

}
