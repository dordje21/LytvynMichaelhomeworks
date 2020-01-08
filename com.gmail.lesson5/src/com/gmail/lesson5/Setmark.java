package com.gmail.lesson5;

public class Setmark {
	public static void setmark(int[][] marks, String[] students, String name, int mark, int lesson) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == (name)) {
				marks[i][lesson] = mark;
				break;
			}	
		}System.out.println("добавили оценку  " + mark + " " + name + " за занятие " + lesson);
	}
}
