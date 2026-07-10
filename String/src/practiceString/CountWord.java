package practiceString;

public class CountWord {
	public void countWord(String s) {
		String result = "";
		int count = 1;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==' ') {
				count++;
			}
			
			
		}
		System.out.println("word is " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountWord count=new CountWord();
		
		count.countWord("This is a good boy");

	}

}
