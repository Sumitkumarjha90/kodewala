package arraypractice_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int arr[]= {-1,-2,0,1,0,1,0,1};
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			if(arr[start]!=0) {
				start++;
			}
			else if(arr[end]==0) {
				end--;
				
			}
			else {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				
			}
		}
		System.out.println(Arrays.toString(arr));

		
	}

}
