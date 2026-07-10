package Userdefineexception;

public class OTTLogin {
	
	public void LoginUser() throws MultipleUserLoginException {
		int user=3;
	
		if(user>1) {
			throw new MultipleUserLoginException("MultipleUserLoginException occurs");
		}

  }

}
