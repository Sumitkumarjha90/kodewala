package day1;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num : ");
		int num=sc.nextInt();
		if(num<=0) {
			System.out.println("Enter a valid an integer ");
		}
		if(num%2==0) {
			System.out.println("It is even number ");
		}
		else {
			System.out.println("It is odd number ");
		}
	}

}
