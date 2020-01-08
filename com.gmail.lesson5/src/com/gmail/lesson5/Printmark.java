package com.gmail.lesson5;

public class Printmark {
	public static void printmark(int[][] marks, String[] students, String name, int lesson) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == (name)) {
				System.out.println(name + " получила оценку за занятие" + " номер " + lesson + " = " + marks[i][lesson]);
			}
		}
	}
}
