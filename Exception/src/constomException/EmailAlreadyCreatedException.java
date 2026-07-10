package constomException;

public class EmailAlreadyCreatedException extends RuntimeException {
	EmailAlreadyCreatedException (String msg){
		super(msg);
	}

}
