package practiceString;

public class PrintCharacterOfString {
	
	public void printString(String name) {//Print all characters of a string one by one.
		int n=name.length();
		int count=0;
		
		for(int i=0;i<n;i++) {
			
			System.out.print(name.charAt(i));
			count++;
			
			
		}
		System.out.println();
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String S=new String("Sumit ");
		PrintCharacterOfString  print=new PrintCharacterOfString();
		print.printString("Sumit kumar jha");
		
		

	}

}
