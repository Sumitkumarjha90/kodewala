package day1;
import java.util.Scanner;
public class BiggestNum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num1 ");
		int num1=sc.nextInt();
		System.out.println("Enter the value of num2 ");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			
			System.out.println(num1+" num1 is the greater then num2");
			
		}else if(num1<num2) {
			System.out.println(num2+" num2 is greater then num1 ");
			
		}else {
			System.out.println("Enter a valid value");
		}
		

	}

}
