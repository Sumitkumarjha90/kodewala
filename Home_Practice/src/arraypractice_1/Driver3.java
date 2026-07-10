package arraypractice_1;

import java.util.Arrays;

public class Driver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,2,4,5,5};
		
		int n=arr.length;
		
		int i=0;
		
		for(int j=1;j<n;j++){
			if(arr[j]!=arr[i]) {
				i++;
				arr[i]=arr[j];
				
			}
			
		}
		System.out.println(Arrays.toString(arr));

      int newArr[] = new int[i + 1];

        int index = 0;

     
        for(int j = 0; j <= i; j++) {
            newArr[index] = arr[j];
            index++;
        }

        System.out.println(Arrays.toString(newArr));
    }

	

}
