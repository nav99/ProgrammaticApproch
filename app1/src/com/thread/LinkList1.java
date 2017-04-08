package com.thread;

import java.util.LinkedList;

public class LinkList1 {

	LinkList1 next;
	Object data;
	int length;

	public LinkList1() {
	}

	public void add(Object data) {
		LinkList1 node = new LinkList1();
		
		if(this.next == null) {
			this.next = node;
			this.data = data;
		}
		
		else {
			LinkList1 temp = this;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			temp.data = data;
		}
	}

	public void print() {
		LinkList1 node = this;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkList1 list = new LinkList1();
		list.add(5);
		list.add(4);
		list.add(6);
		list.add(3);
		list.print();
	}

}
