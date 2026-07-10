package array;
class Driver2{
	public static void main(String[] args) {
		SecondMinELement secMin=new SecondMinELement();
		int arr[]= {10,20,3,4,22,191};
		secMin.secondMin(arr);
	}
}
public class SecondMinELement {
	public void secondMin(int arr[]) {
		
		 if (arr == null || arr.length == 0) {
	            System.out.println("Array is empty");
	            return;
	        }
		 
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			else if(arr[i]<secondMin && arr[i] !=min) {
				secondMin=arr[i];
			}
		}
		if(secondMin==Integer.MAX_VALUE) {
			System.out.println("No second minimum found");
		}
		else {
            System.out.println("Second minimum is: " + secondMin);
        }
	}

}
