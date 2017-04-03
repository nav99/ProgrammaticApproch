package com.test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int  no , reminder , rev=0;
		no=num;
        while(no>0)
        {
        	reminder = no %10;
        	rev = rev*10+reminder;
        	no =no/10;
        }
		
			System.out.println("reverse number is  "+ rev);
		
	}
	

}
