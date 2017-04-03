package com.string;

import java.util.Arrays;

public class AnagramString {
	
	static void isAnagram(String s1 , String s2)
	{
		String copyS1 = s1.replaceAll("//s", "");
		String copyS2 = s2.replaceAll("//s", "");
		char arr1[] =copyS1.toLowerCase().toCharArray();
		char arr2[]= copyS2.toLowerCase().toCharArray();
		Boolean status = true;
		
		if(arr1.length!=arr2.length)
		{
			status = false;
		}
		else
		{
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
		 status	= Arrays.equals(arr1, arr2);
			
		}
		if(status)
		{
			System.out.println("string is Aanagram");
		}
		else
		{
			System.out.println("string is not Anagram");
		}
		
		
	}

	public static void main(String[] args) {
		isAnagram("peek", "KEEP");
		isAnagram("heelo", "oheel");

	}

}
