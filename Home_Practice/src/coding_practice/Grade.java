package coding_practice;

public class Grade {

	public static void main(String[] args) {
		int grade =60;
		
		if(grade >= 90 && grade<=100) {
			System.out.println("Your grade is A");
		}
		else if(grade >= 80 && grade <90) {
			System.out.println("Your grade is B");
			
		}
		else if(grade >= 70 && grade < 80) {
			System.out.println("Your grade is C ");
		}
		else if(grade >=60 && grade < 70) {
			System.out.println("Your grade is D");
		}
		else if(grade <60 ) {
			System.out.println("You are fail");
		}
		else {
			System.out.println("Enter a valid input ");
		}

	}

}
