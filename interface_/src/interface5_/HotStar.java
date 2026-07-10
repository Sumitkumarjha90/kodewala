package interface5_;

interface Netflix{
	
	void loginEmail();
	default void loginMobile() {
		System.out.println("Netflix.login()");
	}

}
public interface HotStar{
	void loginEmail();
	default void loginMobile() {
		System.out.println("HotStar.login()");
	}
}

class User implements Netflix ,HotStar{
	public static void main() {
		User user=new User();
		//user.loginEmail();
		
		
		user.loginMobile();
	}
	@Override
	public void loginMobile() {
		
		HotStar.super.loginMobile();
		
		
	}
	
	@Override
	
	public void loginEmail(){
		System.out.println("User Login  by mail");
		
	}
}