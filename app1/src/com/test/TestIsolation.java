package com.test;

public class TestIsolation {

	static int i=10;
	public static void main(String[] args) {
		TestIsolation t1 = new TestIsolation();
		System.out.println(t1.i);
		TestIsolation t2 = new TestIsolation();
		//t2.i=44;
		System.out.println(t2.i);
		TestIsolation t3 = new TestIsolation();
		t3.i=t3.i;
		System.out.println(t3.toString());
		t2=t1;
		t3=t2;
		t1=t3;
		t1=null;
		System.out.println(t1.i);
		
	}
	@Override
	public String toString() {
		return "TestIsolation [toString()=" + i + "]";
	}
	
      

}
