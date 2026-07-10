package constomException;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Driver.main() started" );
		try {
		User2 u2=new User2();
		u2.createEmail("Sumitkumar@2003.gmail.com");
		
		}
		catch(EmailAlreadyCreatedException e) {
			e.printStackTrace();
			
			
		}
		
		System.out.println("User block will start from here");
		User user=new User();
		
		try {
			user.createEmail();
		}catch(EmailNotCreatedException | NullPointerException | ArithmeticException  e) {
			e.printStackTrace();
		}
		System.out.println("Driver.main() ended");
	}

}
class User{
	public void createEmail() throws EmailNotCreatedException {
		
		System.out.println("Starting of the create email block ");
		
		if(true) {
			throw new EmailNotCreatedException("unable to create email by the user");
		}
		System.out.println("Ending of the create email block ");
	}
}
class User2{
	public void createEmail(String email) {
		System.out.println("Starting of user2 block which already created ");
		
		if(true) {
			throw new EmailAlreadyCreatedException("Already email is created ");
			
		}
		System.out.println("end of the user2 block ");
	}
}
