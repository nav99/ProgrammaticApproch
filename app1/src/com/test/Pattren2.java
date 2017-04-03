package com.test;

public class Pattren2 {

	public static void main(String[] args) {

		int num = 15;
		for (int i = 1; i < num; i++) {

			for (int j = num - i; j > 0; j--) {

				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {

				System.out.print(" "+"*");

			}
			System.out.println();

		}
	}

}
