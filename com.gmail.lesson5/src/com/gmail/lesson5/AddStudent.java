package com.gmail.lesson5;

public class AddStudent {
	public static void addStudent(String[] string, String st) {
		for (int i = 0; i < string.length; i++) {
			if (string[i] == null) {
				string[i] = st;
				break;
			}
		}
	}
}
