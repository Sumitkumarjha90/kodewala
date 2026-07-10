package kodewala;
import java.util.Scanner;
public class SwitchDiscount {
	public void discount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer Type");
		String customerType=sc.next();
		
		switch(customerType){
		case "Gold":
			System.out.println("The person will get 10% Discount on gold");
			break;
		case "Silver":
			System.out.println("THe person will get No discount ");
			break;
			
		case "Platinum":
			System.out.println("The Person will get 15% discount ");
			break;
		default:
			System.out.println("Eneter a valid input ");
			break;
			
		
		}
	}
	public static void calDis(int discount)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchDiscount s=new SwitchDiscount();
		
		s.discount();
		
		

	}

}
