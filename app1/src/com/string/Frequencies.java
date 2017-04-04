package com.string;

import java.util.Arrays;

public class Frequencies {

	public static void main(String[] args) {
		String s1 ="abbcddnnhjk";
		int arr[] = new int[26];
		Arrays.fill(arr, 0);
		for (int i = 0; i <s1.length(); i++) {
			arr[s1.charAt(i)-97]= arr[s1.charAt(i)-97]+1;
			
			
		}
		for (int i = 0; i < 26; i++) {
			
			if(arr[i]!=0)
			{
				System.out.print((char)(i+97));
				System.out.println("   "+arr[i]);                          
			}
		}

	}

}
