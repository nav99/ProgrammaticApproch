package com.test;

import java.io.Serializable;

public class ReverseString implements Serializable{
		   public static void main(String[] args) {
		      System.out.println(reverse("ABCDEFG"));
		      String s1 = "abc";
		      
		   }
		   private static String reverse(String str) {
		      if (str.length() <= 1) {
		         return str;
		      }
		      return reverse(str.substring(1)) + str.substring(0, 1);
		   }
		}

