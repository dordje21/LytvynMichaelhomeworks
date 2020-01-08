package com.gmail.lesson5;

public class Contains {
	public static void contains(String[] string, String st) {
		for (int i = 0; i < string.length; i++) {
			if (string[i] == st) {
				System.out.println(st + " есть в группе");
			}
		}
	}
}
