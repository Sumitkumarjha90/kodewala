package day3;

public class SumDigit {

	public static void main(String[] args) {

		FirstTwoDigitSum sum = new FirstTwoDigitSum();
		sum.twoDigitSum(128);

	}
}

class FirstTwoDigitSum {

	public void twoDigitSum(int num) {

		int third = num % 10;      // last digit
		num = num / 10;

		int second = num % 10;     // middle digit
		num = num / 10;

		int first = num % 10;      // first digit

		if (first + second == third) {
			System.out.println("Sum of first two digits equals third digit");
		} else {
			System.out.println("Sum of first two digits is NOT equal to third digit");
		}
	}
}