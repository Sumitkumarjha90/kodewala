package day4;

public class PrimeOrNot {
	public boolean primeNum(int num) {

	    if (num <= 1) {
	        System.out.println("Not a prime number");
	        return false;
	    }

	    for (int i = 2; i < Math.sqrt(num); i++) {
	        if (num % i == 0) {
	            System.out.println("Not a prime number");
	            return false;
	        }
	    }

	    System.out.println("It is a prime number");
	    return true;
	}

	public static void main(String args[]) {
		PrimeOrNot p=new PrimeOrNot();
		
		p.primeNum(11);
	}

}
