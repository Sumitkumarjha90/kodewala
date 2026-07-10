package iibSIB;

public class liveCount {
	public static void main(String args[]) {
		User u1=new User("14252627278");
		User u2=new User("262627282829");
		User u3=new User("78262527289");
		User u4=new User("72782522788");
		User u5=new User("92827828299");
		User u6=new User("27272822234");
		System.out.println("the total live watching the match is "+User.countLive);
		
		
	}

}
class User{
	public static int countLive=0;
	
	private String number;
	
	public User(String _number) {
		this.number=_number;
	}
	{
		countLive=countLive+1;
		//System.out.println("totalLive watching the match is " );
	}
}