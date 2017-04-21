package com.thread;

import java.util.Scanner;

public class MatrixDigonal {
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
		int sum =0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
				System.out.print(sum +=arr[i][j]);
			}
			System.out.println();
		}

	}
		System.out.println(sum);
}}
