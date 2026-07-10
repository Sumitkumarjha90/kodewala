package kodewala;

public class StatementCon {
	public void printArrayNonZero(int []arr) {
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("loops is started ");
			
			if(arr[i]==0) {
				
				continue;
			}
		}
	}
	public void target(int arr[]) {
		int x=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Second loop is started ");
			if(arr[i]==x) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
	public int sum(int a ,int b) {
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,0,4,5,0,3,2};
		
		StatementCon  con=new StatementCon();
		
		con.printArrayNonZero(arr);
		
		con.target(arr);

		con.sum(10,20);

	}

}
