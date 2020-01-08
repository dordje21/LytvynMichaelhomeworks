package com.gmail.lesson5;

import java.util.Arrays;

public class Clear {
	public static void clear(String[] string) {
		for (int i = 0; i < string.length; i++) {
			string[i] = null;
		}
		System.out.println(Arrays.toString(string));
	}
}
