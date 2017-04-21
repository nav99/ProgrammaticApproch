package com.thread;

class Node
{
int data;
Node left,right;

}

public class TreeTraverse {

	public static void main(String[] args) {
		
Node node = new Node();

node.data=5;
node.left=new Node();
node.left.data=10;
node.right= new Node();
node.right.data=15;
node.left.left=new Node();
node.left.left.data=20;

printNodeData(node);

	}

	private static void printNodeData(Node node) {
		if(node!=null)
		{
		System.out.println(node.data);
		
		}
		else
		{
			return ;
		}
		System.out.println("----");
		printNodeData(node.right);
		System.out.println("***");
		printNodeData(node.left);
		
		
	}
	
	

}
