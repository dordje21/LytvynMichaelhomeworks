package com.gmail.lesson5;

public class Del {
	public static void del(String[] string, String st) {
		for (int i = 0; i < string.length; i++) {
			if (string[i] == st) {
				System.out.println("студент " + string[i] + " удален");
				string[i] = null;
			}
		}
	}
}
