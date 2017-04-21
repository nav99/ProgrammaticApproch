package com.thread;

import java.util.Scanner;

public class TrasposeAmatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row and coloumn");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		System.out.println("Enter data");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		int arr1[][] = new int[col][row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[j][i] = arr[i][j];

			}

		}
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(arr1[i][j] + " ");

			}
   System.out.println();
		}
	}

}
