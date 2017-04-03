package com.string;

public class Reverse {
	private static String reverse(String string) {
	    if (string.isEmpty()) {
	        return string;
	    }
	    int last = string.length();
	    StringBuilder sb = new StringBuilder(string.length());
	    boolean contextspace = ' ' == string.charAt(string.length() - 1);
	    for (int i = string.length() - 1; i >= 0; i--) {
	        if (contextspace != (string.charAt(i) == ' ')) {
	            sb.append(string.substring(i + 1, last));
	            last = i + 1;
	            contextspace = !contextspace;
	        }
	    }
	    sb.append(string.substring(0, last));
	    return sb.toString();
	}
	public static void main(String[] args) {
		String  str="welcome to banglore";
		System.out.println("reverse string is"+ reverse(str));
		
	}
}
