package com.collection;

import java.util.Arrays;

class QueueImpl
{
private int capacity;
private int rear;
private int front;
private int arr[] ;

public QueueImpl() {
	super();
	this.capacity = 5;
	this.rear = -1;
	this.front = -1;
	this.arr = new int [capacity];
}

public void add(int num )
{
if(rear==capacity)
{
	System.out.println("Queue is full");
}
else
{
	System.out.println(num);
	arr[++rear]=num;
	front=0;
	
}
}

public void pop()
{
	int element=0;
	
	
	for(int i=0;i<arr.length-1;i++)
	{
		if(i==0)
		{
			//System.out.println("--"+arr[i]);
			element=arr[0];
			for(int j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
				
			}
			rear--;
			
		}
		
	}
	System.out.println("Pop element :"+element);
}

@Override
public String toString() {
	return "QueueImpl [arr=" + Arrays.toString(arr) + "]";
}


	
}

public class MyQueue {

	public static void main(String[] args) {
		QueueImpl q=new QueueImpl();
		q.add(10);
		q.add(40);
		q.add(30);
		q.add(20);
		//q.add(50);
		q.pop();
		q.pop();
		System.out.println("queue "+q.toString());

	}

}
