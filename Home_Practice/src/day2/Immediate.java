package day2;

public class Immediate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		int ans = 0;
		if(num % 5 == 0) {
			
			ans=num + 5;
			
		}else {
			ans = num + (5 - (num % 5)); 
		}
		System.out.println(ans);
	}

}
