package com.test;

public class Pattern4 {

		public static void main(String[] args) {
			
			int n =6;

			for (int i = 1; i < n; i++) {
				for (int j = n; j > i; j--) 
					System.out.print(" ");
					
				 System.out.print(" "+"*");
				 System.out.println("");
			

			}
		}
	}



