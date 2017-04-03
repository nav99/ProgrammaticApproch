package com.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepetedElementOfArray {

	public static void main(String[] args) {
		int arr[] = {10,10,12,11,4,5};
		
		repetedElement(arr);

	}

	private static void repetedElement(int[] arr) {
		
		
		HashMap<Integer ,Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
			
	
		}
	
	/*	Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry m1=(Entry) it.next();
			
			
			System.out.println(m1.getKey()+" "+m1.getValue());
			
		}*/
		 Set<Integer> keys = map.keySet();
	        for(Integer ch:keys){
	            if(map.get(ch) > 1){
	                System.out.println(ch+"--->"+map.get(ch));
	            }
	
	}

	}
}
