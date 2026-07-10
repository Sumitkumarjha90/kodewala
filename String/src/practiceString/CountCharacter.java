package practiceString;

class Count {
	public void countCharacter(String word) {
		
		for(int i=0;i<word.length();i++) {
			int count=0;
			
			char ch=word.charAt(i);
			
			for(int j=0;j<word.length();j++) {
				
				if(word.charAt(j)==ch) {
					count++;
				}
			}
			System.out.println(word.charAt(i)+" "+count);
			
			
		}
		
		
		
	}
	

}
public class CountCharacter{
	public static void main(String args[]) {
		Count c=new Count();
		
		c.countCharacter("apple");
	}
}
