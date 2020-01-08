package com.gmail.lesson5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] students = new String[15];

		int[][] marks = new int[15][32];

		int mark = 12;
		int lesson = 2;
		String st1 = "Andrey";
		students[5] = "Vasy";
		students[7] = "Kate";
		students[11] = "Maks";
		students[14] = "Masha";
		AddStudent.addStudent(students, st1);
		String name = "Kate";
		Setmark.setmark(marks, students, name, mark, lesson);
		Printmark.printmark(marks, students, name, lesson);
		Del.del(students, "Vasy");
		System.out.print("список на печать: ");
		Print.print(students);
		Contains.contains(students, "Andrey");
		SortStudent.sortStudent(students);

		System.out.println(Arrays.toString(students));

		Clear.clear(students);
	}

}
