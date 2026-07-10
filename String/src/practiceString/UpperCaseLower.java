package practiceString;

public class UpperCaseLower {
	public String upperToLower(String name) {
		
		
		System.out.println(name.toLowerCase());
		
		return name;
		
	}
	public void lowerToUpper(String name) {
		
		System.out.println(name.toUpperCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpperCaseLower low = new UpperCaseLower();
		
		low.upperToLower("SUMIT");	
		
		low.lowerToUpper("sumit");
		
		

	}

}
