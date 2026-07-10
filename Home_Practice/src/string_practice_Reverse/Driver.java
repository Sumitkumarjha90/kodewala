package string_practice_Reverse;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="my name is sumit";
		
		String []  s1=  s.split(" ");
		
		System.out.println(Arrays.toString(s1));
		String result = "";
		
		for (int i =0;i<s1.length;i++)
		{
		
		 result+=reverse(s1[i])+" ";
		}
		System.out.println(result);
		
		
		
	}
	public static String reverse(String s1)
	{
		
		String result  = "";
		for(int i=s1.length()-1;i>=0;i--)
		{
			result+=s1.charAt(i);
		}
		
		return result;
		
	}

}
