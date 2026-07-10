package inheritance;

public class Notification {
	
	String countryName="India";
	
	public void sendEmail(String accountId,String bankName,String accountCreated) {
		
		System.out.println("Send the notification by email bank account is created ");
		
	}
	public void sendSMS(String Mobile,String text) {
		System.out.println("Send the notification by SMS bank account  is created ");
	}

}
class AccountInfo extends Notification{
	public void acountinfo() {
		sendEmail("25373","SBI","This account is created ");
	}
	
}

class AccountCreate {
	public static void main(String args[]) {
		
		AccountInfo notification=new AccountInfo ();
		notification.sendEmail("161515","SBI","the acount is created");
		notification.sendSMS("send to mobile ","this is send to your mobile by sms");
		
		
		
	}
	
}
