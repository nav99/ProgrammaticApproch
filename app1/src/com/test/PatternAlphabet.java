package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author vivek
 *
 */
public class PatternAlphabet {
	public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<>();
	map.put(1, "ram");
	map.put(2, "shayam");
	Set<Entry<Integer, String>> s1 = map.entrySet();
	
	Iterator it =s1.iterator();
	while(it.hasNext())
	{
		Map.Entry m1=(Entry) it.next();
		System.out.println(m1.getKey()+"    "+m1.getValue());
	}
	for(Map.Entry<Integer, String> s :map.entrySet())
	{
		System.out.println(s.getKey()+"  "+s.getValue());
	}
			
			
			
			
			
			
	{
	
	}
	
	}

}
