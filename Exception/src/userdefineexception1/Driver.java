package userdefineexception1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Driver {

	public static void main(String[] args) {
		
		
		System.out.println("main method start");
		
		try(BufferedReader br=new BufferedReader(new FileReader("/Users/sumit/Desktop/Eclipse_java/Exception/src/expectionfile/Sales_data.txt"));){
			
			String line;
			
			while((line=br.readLine()) !=null) {
				
				System.out.println(line);
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
