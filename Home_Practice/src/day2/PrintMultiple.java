package day2;
import java.util.Scanner;
public class PrintMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid  integer");
		int num = sc.nextInt();
	 if((num % 4==0) && (num % 5==0)) {
			 while(i<=100){
				 
				System.out.println("Lara");
				i++;
			}
		}
	 	else if(num%4==0) {
			System.out.println("Java");
		}
		else if(num % 5==0) {
			System.out.println("J2ee");
		}
		
	}

}
