package interface3_;

interface NotificationSend{
	void msgSend();//2022
	void emojiSend();//2022
	void photoSend();//2022
	
	default void stickerSend() {//2024
		System.out.println("NotificationSend.stickerSend()");
		
	}
}
class Mail implements NotificationSend{

	@Override
	public void msgSend() {
		System.out.println("Mail.msgSend()");
		
	}

	@Override
	public void emojiSend() {
		System.out.println("Mail.defaultMSG()");
		
	}

	@Override
	public void photoSend() {
		System.out.println("Mail.whatAppMSG()");
		
	}
	
}
class DefaultMSG implements NotificationSend{

	@Override
	public void msgSend() {
		System.out.println("DefaultMSG.msgSend()");
	}

	@Override
	public void emojiSend() {
		System.out.println("DefaultMSG.defaultMSG()");
	}

	@Override
	public void photoSend() {
		System.out.println(" whatAppMSG");
		
	}
	public void stickerSend() {
		System.out.println("DefaultMSG.stickerSend()");
	}
	
}
class WhatsApp implements NotificationSend{

	@Override
	public void msgSend() {
		System.out.println("WhatsApp.msgSend()");
		
	}

	@Override
	public void emojiSend() {
		System.out.println("WhatsApp.emojiSend()");
		
	}

	@Override
	public void photoSend() {
		System.out.println("WhatsApp.photoSend()");
		
	}
	public void stickerSend() {
		System.out.println("WhatsApp.stickerSend()");
	}
	
}
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhatsApp w=new WhatsApp();
		w.emojiSend();
		w.stickerSend();

	}

}
