package com.thread;

import java.util.Scanner;

public class PrintMatrixZ {

	public static void main(String[] args) {

		System.out.println("enter the row and coloumn");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();

			}

		}
		PrintZInMatrix(arr);

	}

	private static void PrintZInMatrix(int[][] arr) {
		int row = arr.length - 1;
		int col = arr.length - 1;
		int firstRow = 0;
		int lastRow = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == 0) {
					System.out.print(arr[i][j]);
				} 
				else if (i == firstRow && j == lastRow) {
					for(int k=lastRow-1;k>=0;k--)
					{
						System.out.print(" ");
					}
					System.out.print(arr[i][j]);
				}
				else {

					if (i == col) {
						System.out.print(arr[i][j]);
					}
				
				}
			}
			++firstRow;
			--lastRow;
			System.out.println();
		}
	}

}
