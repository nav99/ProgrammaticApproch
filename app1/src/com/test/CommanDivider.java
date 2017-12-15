package com.test;

public class CommanDivider {

	public static void main(String[] args) {

		int a=9; int b=15; int c=20;
		
		int min = a<b?a:(a<c?a:c);
	//	System.out.println(min);
		boolean flag = false;
		int max = a+b+c;
		for (int i = 2; i < min; i++) {
			
			if(a%i==0 && b%i==0 && c%i==0)
			{
			flag = true;
			System.out.println("comman divisble factore    "    +i);
			}
			else
			{
			//	System.out.println("no comman divisble");
				flag=false;
			}
			
		}
		
	}

}
