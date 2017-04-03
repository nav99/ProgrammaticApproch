package com.test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		isPrime(i);

	}

	private static void isPrime(int i) {
		
		boolean flag = false;
		for (int j = 2; j < i/2; j++) {
			
			if(i %j ==0)
			{
				flag=false;
				break;
			}
			else
			flag=true;
		
			
		}
		if(flag)
		{
			System.out.println("number is prime");
		}
		else
			System.out.println("Not Prime");
		
		
		
		
	}

}














