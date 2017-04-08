package com.string;

import java.util.StringTokenizer;

public class ReverseWord {

	public static void main(String[] args) {
    
		String s1 = "This is java oracle mysql";
		StringTokenizer st = new StringTokenizer(s1, " ");
        String revsersedWord="";
      while(st.hasMoreElements())
      {
    	  
    	  revsersedWord=st.nextElement()+" "+revsersedWord;
    	 //sb.append( st.nextToken()) ;
    	// System.out.println(st.nextToken());
      }
      System.out.println(revsersedWord);
	
	}

}
