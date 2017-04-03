package com.arrays;

public class MargeArray {

	public static void main(String[] args) {
	
		int a[] =  {1,2,3,4};
		int b[]= {5,6,7,8};
		
		int c[]=new int[a.length+b.length];
        int count=0;
        for (int i = 0; i < a.length; i++) {
        	
        	c[i]=a[i];
			count ++;
		}
		for (int i = 0; i < b.length; i++) {
			c[count++]=b[i];
		}
		for (int k = 0; k < c.length; k++) {
			
			for (int j = 0; j < c.length; j++) {
				
				int temp;
				//System.out.println(c.length);
				if(c[k]<c[j])
				{
					temp=c[j];
					c[j]=c[k];
					c[k]=temp;
					
					
				}
			}
		}
		for (int j = 0; j < c.length; j++) {
		  System.out.print(c[j]);
			
		}
			
		}
	}


