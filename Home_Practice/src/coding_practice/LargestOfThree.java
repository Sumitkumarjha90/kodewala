package coding_practice;

public class LargestOfThree {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 5;
		
		
		if((a > b) && a > c) {
			
			System.out.println("A is greater then B  and C ");
		}
		else if((b > a) && b > c) {
			System.out.println("B is greater then A and C ");
			
		}
		else {
			System.out.println("C is greater the A and B ");
		}

	}

}
