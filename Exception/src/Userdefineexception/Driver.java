package Userdefineexception;

public class Driver {

	public static void main(String[] args) {
		OTTLogin ott=new OTTLogin();
		try {
			ott.LoginUser();
		}
		catch(MultipleUserLoginException e) {
			e.printStackTrace();
			System.out.println("MultipleUserLoginException is occurs");
		}

	}

}
