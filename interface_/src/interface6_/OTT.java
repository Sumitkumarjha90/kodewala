package interface6_;


interface DataPrintable
	{
	
}

class OTTServer implements DataPrintable{
	
	String user;
	String password;
	
	public OTTServer(String _user,String _password){//created a constructor
		super();
		this.user=_user;
		this.password=_password;
	}
}

class ServerData{
	
	public void printData(Object obj) {
		
		
		if(obj instanceof DataPrintable) {
			
			OTTServer ser=(OTTServer) obj;
			
			System.out.println("user id : " +ser.user);
			
			System.out.println("password :" +ser.password);
		}
		else {
			System.out.print("DataNotPrintableException ");
		}
	}
	
}
public class OTT {
	public static void main(String[] args) {
		OTTServer ott=new OTTServer("Sum@123", "112233");
		ServerData ser=new ServerData();
		ser.printData(ott);
		
	}
	

}
