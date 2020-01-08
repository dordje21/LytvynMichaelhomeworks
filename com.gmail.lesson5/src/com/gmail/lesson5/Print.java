package com.gmail.lesson5;

public class Print {
	public static void print(String[] string) {
		for (int i = 0; i < string.length; i++) {
			if (string[i] == null) {
				System.out.print("");
			} else {
				System.out.print(string[i] + " ");
			}
		}
		System.out.println();
	}
}
