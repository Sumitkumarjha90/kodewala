package day3;



class SwapTwoNum{
	public void swapNum(int num1,int num2) {
		num2 = num1 + num2;
		num1 = num2 - num1;
		num2 = num2 - num1;
		
		System.out.println(num1+" "+num2);
		
	}
}
public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNum swap=new SwapTwoNum();
		swap.swapNum(10, 20);

	}

}
