package arraypractice_1;

public class Driver2 {
	public static void main(String args[]) {
		int arr[]= {1,2,3,5,6,7,8,9};
		int sum=0;
		int n=arr.length+1;
		
		for(int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
			
		}
		int actualSum=n*(n+1)/2;
		
		
		System.out.println(Math.abs(sum-actualSum));
		
	
		
		
		
	}

}
