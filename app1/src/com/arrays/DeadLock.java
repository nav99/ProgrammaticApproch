package com.arrays;

public class DeadLock extends Thread {

	public static Object o1 = new Object();
	public static Object o2 = new Object();

	public static void main(String[] args) {

		System.out.println();
		A a1 = new A();
		B b1 = new B();

		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(b1);

		t1.start();
		t2.start();

	}

}

class A extends Thread {

	public void run() {

		synchronized (this) {
			try {
				System.out.println("i am lock 1");

				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		//	synchronized(o2)
			{
				
			}

		}
	}
}

class B extends Thread {
	public void run() {

		System.out.println("");
	}
}
