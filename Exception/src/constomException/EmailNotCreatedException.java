package constomException;

public class EmailNotCreatedException extends RuntimeException {
	
	EmailNotCreatedException(String msg)
	{
		super(msg);
	}

}
