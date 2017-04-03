package com.test;

import java.util.ArrayList;
import java.util.Comparator;

class Name implements Comparator
{

	@Override
	public int compare(Object a1,Object b1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


public class SortingByName extends Name {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("ram");
		list.add("shriram");
		list.add("ghanshram");
		list.add("chokeram");
		list.add("jairam");
		
		Name n1 = new Name();


	}

}
