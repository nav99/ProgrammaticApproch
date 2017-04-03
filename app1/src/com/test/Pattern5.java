package com.test;

public class Pattern5 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			int no = 65;
			for (int j = 0; j < i; j++) {

				System.out.print((char) no);
				no++;

			}
			System.out.println();

		}

	}

}
