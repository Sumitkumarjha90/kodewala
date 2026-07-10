package day1;

public class Smaller {
	public static void main(String args[]) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		if(num1 < num2 && num1 < num3) {
			
			System.out.println("num1 is smaller then num3 and num2");
			
		}else if(num1 > num2 && num2 < num3) {
			
			System.out.println("num2 is smaller the num1 and num2");
			
		}else if(num3 < num1 && num3 < num2) {
			
			System.out.println("num3 is Smaller the num1 and num2");
			
		}else {
			
			System.out.println("Enter valid input");
		}
	}

}
