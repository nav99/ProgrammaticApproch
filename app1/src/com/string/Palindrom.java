package com.string;

public class Palindrom {

	public static void main(String[] args) {
    
		String str ="ab cd,ef g::g  fe,,,, #dc @bA";
		String s1 = str.replaceAll("[, : # @]","").toLowerCase();
		System.out.println(s1);
		if(isPalindrome(s1))
		{
			System.out.println("number is palindromee");
		}
		else
			System.out.println("Not Palindrome ");
		
		
	}

	private static boolean isPalindrome(String s1) {
		char[] ch=s1.toCharArray();
		for (int i = 0 ,j = s1.length()-1; j>=0; i++,j--) {
			
			if(ch[i]!=ch[j])
			{
				
				return false;
			}
			
		}
		return true;
	}

}
