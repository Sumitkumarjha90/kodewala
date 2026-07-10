package array;

public class SumOfElement {
	public void sumOfElement(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=arr[i]+sum;
		}
		System.out.print("The sum of the element of array is "+sum);
	}
	
	public static void main(String args[]) {
		
		int arr[]= {12,8,10,4,6};
		SumOfElement add=new SumOfElement();
		
		add.sumOfElement(arr);
	}

}
