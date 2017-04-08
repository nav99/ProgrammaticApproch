package com.collection;
class MyStack
{
	private Object[] elements;
	private int size;
	private int capacity;
	public MyStack() {
		
		capacity =5;
		
		elements = new Object[capacity];
	}
	
	public void add(Object obj)
	{
		if(size==capacity)
		{
			alterCapacity();
		}
		elements[size++]=obj;
	}

	private void alterCapacity() {
		capacity = capacity*2;
		Object temp[] = elements;
		elements = new Object [capacity];
		for (int i = 0; i < temp.length; i++) {
			
			elements[i]=temp[i];
			
		}
	}
		
		public Object process()
		{
			return elements[--size];
		}
		public String toString()
		{
			StringBuffer sb = new StringBuffer("[");
			for (int i = 0; i < elements.length; i++) {
				if(elements[i]!=null)
				sb.append(elements[i]+",");
			}
			return sb.substring(0,sb.length()-2).concat("]");
			
		}
		public int size()
		{
			return size;
		}
	

	
	
}



public class OwnStack {

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.add(90);
		ms.add(91);
		ms.add(96);
		ms.add(97);
		ms.add(12);
		ms.add(13);
		ms.add(90);
		ms.add(91);
		ms.add(96);
		ms.add(97);
		ms.add(12);
	//	System.out.println(ms);
		System.out.println(ms.size());
		System.out.println(ms.process());

	}

}
