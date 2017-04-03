package com.test;

public class NumberPrint {

	public static void main(String[] args) {
		//int i=1;
     num(1);
	}

	/**
	 * @param i
	 */
	private static void num(int i) {
	
		if(i<=10)
		{   
			
			System.out.println(i);
	
			num(i+1);
			
		}
	//	
		
		
	}

}
