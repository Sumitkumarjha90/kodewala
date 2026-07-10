package day2;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =10;
		int num2 =24;
		
		while(num1 < num2) {
			if(num1 % 2 ==0) {
				System.out.println(num1);
				num1++;
			}
			else {
				System.out.println();
				num1++;
				
			}
		}

	}

}
