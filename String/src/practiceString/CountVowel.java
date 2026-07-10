package practiceString;

public class CountVowel {
	
	public void countVowel() {
		
		String su = "Hello_Raman";
		
		int n = su.length();
		
		 int count = 0;
		 
		for(int i = 0;i < n; i++) {
			
			char ch=su.charAt(i);
			
			if(ch=='a'|| ch=='e' || ch=='o' || ch=='u' || ch=='u'|| ch=='i') {
				
				System.out.print(" "+ch +" ");
				
				count++;
				
			}
		}System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountVowel count=new CountVowel();
		
		count.countVowel();

	}

}
