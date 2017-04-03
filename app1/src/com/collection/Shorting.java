package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shorting implements Comparable  {
	
	private int i;
	

	public Shorting(int i)
	{
		this.i = i;
	}

	public static void main(String[] args) {
		
    List a1 = new ArrayList<>();
    
    a1.add(new Shorting(10));
    a1.add(new Shorting(110));
    a1.add(new Shorting(5));
    a1.add(new Shorting(12));
    Collections.sort(a1);
    System.out.println(a1);
	}
    
	//Collections.sort(new compareTO() ,al);  
	@Override
	public int compareTo(Object a1) {
		
		return this.i -((Shorting)a1).i;
	}

/*	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
*/
	@Override
	public String toString() {
		return "Shorting [i=" + i + "]";
	}

    

}
