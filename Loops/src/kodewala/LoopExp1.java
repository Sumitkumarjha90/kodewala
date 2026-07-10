package kodewala;

public class LoopExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String target="bangalore";
		
		String arr[]= {"Chennai","bangalore","darbhanga","jaipur"};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside for loop");
			if(target==arr[i]) {
				System.out.println("The target is found : "+arr[i]);
				break;
			}
		}

	}

}
