package interface1_;



class HotStar implements IEntertainmentOTT{
	@Override
	public void signUp() {
		System.out.println("signup done");
		
	}
	
	@Override
	public void login() {
		System.out.print("login done");
		
	}
	
	@Override
	public void subscribe() {
		System.out.print("subscribe to get more features");
		
	}
	
	@Override
	public void cancelSubscription() {
		System.out.print("cancel you subscription ");
		
	}
	
	@Override
	public void loginMultipleUser() {
		System.out.println("login multiple user");
		
	}
	
	@Override
	public void upgradeSubscription() {
		System.out.print("Upgrade your Subscription");
		
	}

}

class Netflix implements IEntertainmentOTT{

	@Override
	public void signUp() {
		System.out.println("signup done");
		
		
	}

	@Override
	public void login() {
		System.out.println("login done");
		
	}

	@Override
	public void subscribe() {
		System.out.println("signup done");
		
		
	}

	@Override
	public void cancelSubscription() {
		System.out.println("cancel your subscription ");
	
	}

	@Override
	public void loginMultipleUser() {
		System.out.println("multiple user login done");

		
	}

	@Override
	public void upgradeSubscription() {
		System.out.print("Upgrade your Subscription");
	}
	
}
 class Sonylive implements IEntertainmentOTT{

	@Override
	public void signUp() {
		System.out.print("singup done");
		
	}

	@Override
	public void login() {
		System.out.print("singup done");
		
	}

	@Override
	public void subscribe() {
		System.out.println("Subscribe is done ");
		
	}

	@Override
	public void cancelSubscription() {
		System.out.print("cancel subscription  renew it ");
		
	}

	@Override
	public void loginMultipleUser() {
		System.out.print("loginmultiple user done");
		
	}

	@Override
	public void upgradeSubscription() {
		System.out.println("upgradeSubscription");
		
	}
	
}
public class Driver {
	

	public static void main(String[] args) {
		Netflix netflix=new Netflix();
		
		netflix.loginMultipleUser();
		
		netflix.cancelSubscription();
		
		HotStar hot=new HotStar();
		hot.signUp();
		
	}

}

