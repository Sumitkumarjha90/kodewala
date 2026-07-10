package day4prime;

public class PrimeTwoNum {
	public void primeTwoNum(int start,int end) {
		
		
		for(int num=start;num<=end;num++) {
			
			if(num<=1) continue;
			
			boolean isPrime=true;
			
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num % i == 0) {
					isPrime=false;
					break;
					
				}
			}
			if(isPrime) {
				System.out.println(num);
				
			}
			
			
		}
	}
}
class Driver4{
	public static void main(String args[]) {
		
		PrimeTwoNum p=new PrimeTwoNum();
		p.primeTwoNum(10, 20);
	}

}
