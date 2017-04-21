package com.test;

public class DemoGc {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			DemoGc demo = new DemoGc();
			//demo =null;
		}
		Runtime r = Runtime.getRuntime();
		
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		r.gc();
		System.out.println(r.freeMemory());
	}
		public void finalize()
		{
			System.out.println("free memory");
		}
	

}
