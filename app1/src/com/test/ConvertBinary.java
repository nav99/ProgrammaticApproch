package com.test;

import java.util.Scanner;

public class ConvertBinary {

	public static void main(String[] args) {
		System.out.println("enter a number convert to binary");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		binaryNumber(num);

	}

	private static void binaryNumber(int num) {

		int no = 0;
		String reverse="";
		int reminder;
		no = num;
		while (no != 0) {
			reminder = no % 2;

			reverse = reverse + String.valueOf(reminder);

			no = no / 2;

		}
		for (int i = reverse.length() - 1; i > -1; i--) {

			System.out.print(reverse.charAt(i));

		}

	}

}
