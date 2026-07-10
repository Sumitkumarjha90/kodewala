package expectionfilefinally;

import java.io.BufferedReader;
import java.io.FileReader;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br=null;
		
		try {
			System.out.println("try block started");
			br=new 	BufferedReader(new FileReader("/Users/sumit/Desktop/Eclipse_java/Exception/src/expectionfile/Sales_data.txt"));
			
			//String name=args[0];
			
			//System.exit(0);
			
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Name is Null ");
		}
		finally
		{
			br.close();
		System.out.println("finally block ");
		}

	}

}
