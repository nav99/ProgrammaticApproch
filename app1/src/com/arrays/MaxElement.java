package com.arrays;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int arr[] = new int[no];
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
			{

				if (arr[i] < arr[j]) {
					int temp;

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;

				} 
		}
		for (int j = 0; j < arr.length ; j++) {
			System.out.println(arr[j]);
			

		}
		for (int j = arr.length-1; j >=0; j--) {
			
			System.out.println(arr[j]);
			
		}

	}

	}
}
