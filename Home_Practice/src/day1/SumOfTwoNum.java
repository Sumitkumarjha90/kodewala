package day1;

public class SumOfTwoNum {
	public static void main(String args[]) {
		 int num1 = 10;
		 int num2 = 20;
		 int num3 = 3;
		 
		 
		 if((num1 + num2 == num3) || (num2 + num3 == num1) || (num1 + num3 == num2)){
			 System.out.println(true);
		 }
		else{
			 System.out.println(false);
		 }
	}
}

