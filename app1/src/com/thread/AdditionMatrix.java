package com.thread;

import java.util.Scanner;

public class AdditionMatrix {

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
		System.out.println("enter row and coloumn");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		int[][] arr1 = new int[row1][col1];

		System.out.println("Enter data");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				arr1[i][j] = sc.nextInt();
			}

		}
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+arr1[i][j]);
			}
			System.out.println();
		}

	}

}
