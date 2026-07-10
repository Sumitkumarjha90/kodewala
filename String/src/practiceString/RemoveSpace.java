package practiceString;

public class RemoveSpace {
	
	public void removeSpace(String word) {
		
		String result = "";
		
		for( int i =0; i<word.length(); i++) {
			
			if(word.charAt(i)!=' ') {
				result=result+word.charAt(i);
			}
			
		}
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveSpace rem=new RemoveSpace();
		
		rem.removeSpace("this is the day where everything was started ");

	}

}
