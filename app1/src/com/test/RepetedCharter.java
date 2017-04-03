package com.test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class RepetedCharter {

	public static void main(String[] args) {
		System.out.println("enter a String to find repeted character");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		RepetedCharacter(str);

	}

	private static void RepetedCharacter(String string) {
		HashMap<Character, Integer> map = new HashMap<>();
		char arr[] = string.toCharArray();
		for (Character ch : arr) {

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);

			}

		}
		Set<Character> keySet = map.keySet();
		for (Character ch : keySet) {
			if (map.get(ch)>1) {
				System.out.println(ch + "    " + map.get(ch));
			}

		}

	}

}
