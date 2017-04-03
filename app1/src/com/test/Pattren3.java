package com.test;

public class Pattren3 {

	public static void main(String[] args) {
		
		int n =6;

		for (int i = 1; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
				
			}

			for (int j = 0; j < i ; j++) {
				
				System.out.print(" "+(i+j));

			}
			System.out.println("");
		}
	}
}
