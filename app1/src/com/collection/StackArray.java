package com.collection;



class MyStack11 {
	private int[] arr;
	private int capacity;
	private int top;

	public MyStack11() {
		this.capacity = 4;
		this.arr = new int[capacity];
		this.top = -1;
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

	public boolean isStackFull() {
		return (top == arr.length - 1);
	}

	public void push(int data) {
		if (isStackFull()) {
			stackCapacityDouble();
			arr[++top] = data;
			 System.out.println(data);
		} else {
			System.out.println(data);
			arr[++top] = data;
		}
	}

	private void stackCapacityDouble() {

		int[] temp = new int[capacity * 2];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		capacity = capacity * 2;
		arr = temp;
	}

	public int pop() {
		if (isStackEmpty())
			System.out.println("Stack Underflow");
		
		return arr[top--];
	}

}

public class StackArray {

	public static void main(String[] args) {
		MyStack11 ms = new MyStack11();
		ms.push(10);
		ms.push(20);
		ms.push(30);
		ms.push(40);
		ms.push(50);
		ms.push(60);
		ms.push(60);
		ms.push(60);
		ms.push(60);
		ms.push(60);
		ms.push(60);
		ms.push(60);

	}

}
