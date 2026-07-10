package array;

public class MaxElement {
	public void maxValue(int arr[]) {
		
		 if (arr == null || arr.length == 0) {
	            System.out.println("Array is empty");
	            return;
	        }
		 
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.print("The max value of arr is : "+max);
		
	}

}
class Driver1{
	public static void main(String args[]) {
		MaxElement max=new MaxElement();
		int arr[]= {10,20,1,40,2,90};
		max.maxValue(arr);
	}
}
