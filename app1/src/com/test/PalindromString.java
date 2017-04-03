package com.test;

import java.util.Scanner;

public class PalindromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean flag =false;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		char arr[]=str.toCharArray();
		for(int i=arr.length-1,j=0;i>arr.length/2;i--,j++)
			if(arr[i]==arr[j]){
				flag=true;
			}
			else
				break;
				
		if(flag)
			System.out.println("palindrom  "+  str);
		else
			System.out.println("not palindrom"+str);
	}

}
