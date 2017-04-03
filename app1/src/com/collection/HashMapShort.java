package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapShort implements Comparator {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer ,String>();
		map.put(1, "vivek");
		map.put(2, "Ankit");
		map.put(3, "DK");
		map.put(4, "joan");
		map.put(5, "Anurag");
		map.put(6, "nijam");
		System.out.println(map);
       Set <Entry<Integer,String>> set=map.entrySet();	
       
       ArrayList<Entry<Integer,String>> list = new ArrayList<Entry<Integer,String>>();
       System.out.println("--------");
       Collections.sort(list, new Comparator<Map.Entry<Integer,String>>(){
    	   
      	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
      		System.out.println("----");
		
		return o2.getValue().compareTo(o1.getValue());
       }
       });
       
       for(Entry<Integer ,String >m: list)
       {
    	   System.out.println(m.getValue());
       }
	}

	@Override
	public int compare(Object o1, Object o2) {
		
		System.out.println("-----------");
		// TODO Auto-generated method stub
		return 00;
	}

	

}
