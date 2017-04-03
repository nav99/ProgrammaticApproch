package com.test;

import java.util.Scanner;

public class NumberPalindrom {

	public static void main(String[] args) {
     
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem=0,rev=0;
		int save=num;
		while(num>0)
		{
			rem =num%10;
		    rev=rev*10+rem;
		    num=num/10;
		}
		if(num==rev)
		{
			System.out.println("PLINDROME");
		}
		else
			System.out.println("Not Palindrome");
	}
	

}
