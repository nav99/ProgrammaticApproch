package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MaxNumber {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(90);
		al.add(89);
		al.add(99);
		al.add(19);
		al.add(97);
		
		Collections.sort(al, new Comparator<Object>(){
				 public int compare(Object obj1, Object obj2) {
					 String s1 = String.valueOf(obj1);
					 String s2 = String.valueOf(obj2);
					 
					return  (s2+s1).compareTo(s1+s2);
				
		}
	});
   
		StringBuffer sb = new StringBuffer();
	for (int i = 0; i < al.size(); i++) {
		
		 sb.append(al.get(i));
	}

	System.out.println(sb);

	}
}
