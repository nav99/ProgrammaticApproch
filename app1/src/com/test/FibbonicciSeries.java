package com.test;

public class FibbonicciSeries {

	public static void main(String[] args) 
	
	{ 
	//	int i=10;
		System.out.println(0);
		System.out.println(1);
		
		fibbonicci(10);

	}

	private static void fibbonicci(int i) {
		long a= 0;
		long b=1;
		while(i>1)
		{
		
		long c=a+b;
		a=b;
		b=c;
		
		System.out.println(c);
		i--;
		}
	}

}
