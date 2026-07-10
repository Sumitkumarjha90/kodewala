package array;

public class MinElement {
	public void minvalue(int arr[]) {
		
		
		 if (arr == null || arr.length == 0) {
			 
	            System.out.println("Array is empty");
	            return;
	        }
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		System.out.println("The min element is : "+min);
	}

}
class Driver{
	public static void main(String args[]) {
		
		MinElement min = new MinElement();
		int arr[]= {10,2,20,3,9,4,1};
		
		min.minvalue(arr);
		
	}
}
