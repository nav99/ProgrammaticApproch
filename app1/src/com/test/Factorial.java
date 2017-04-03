package com.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("factorial number is  " + fact(num));

	}

	private static int fact(int num) {
		int factoral=1;
		if (num == 1 || num==0) {
			return 1;
		} else {
			while (num > 0) {
				 factoral  = factoral * num;
				num--;

			}

		}
		return factoral;
	}

}
