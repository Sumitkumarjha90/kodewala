package interface6_functional;


@FunctionalInterface
public interface ISQRT {
	double squareRoot(int num);
	

}

class Driver2{
	public static void main(String[] args) {
		 ISQRT sq=(num)->(num*num);
		 
		 double s=sq.squareRoot(2);
		 
		 System.out.print("square root is "+s);
	}
}
