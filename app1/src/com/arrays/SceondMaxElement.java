package com.arrays;

import java.util.Scanner;

public class SceondMaxElement {
	public static void main(String[] args) {

		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int arr[] = new int[no];
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

		}

		findSceondMax(arr);

	}

	private static void findSceondMax(int[] arr) {

		int fristNum = 0, sceondNum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (fristNum < arr[i]) {
				sceondNum = fristNum;
				fristNum = arr[i];

			} else {
				if ((sceondNum > arr[i]))
					sceondNum = arr[i];
			}

		}
		System.out.println(sceondNum);

	}
}