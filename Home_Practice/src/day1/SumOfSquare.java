package day1;

public class SumOfSquare {
	public static void main(String args[]) {
		int num1 = 2;
		int num2 = 3;
		int num3 =5;
		
		if(((num1+num2)*(num1+num2)==num3) ||
		  ((num1+num3)*(num1+num3)==num2)|| 
		  ((num2 + num3)*(num2+num3)==num1)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

}

