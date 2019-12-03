package com.gmail.lessoncom.gmail.lesson;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("введите число 1");
		int a = sc.nextInt();
		System.out.println("введите число 2");
		int b = sc.nextInt();

		int c = (a + b) / 2;

		System.out.println("среднее число = " + c);

		System.out.println("введите числа через запятую");
		String nums = sc.next();

		String spliter = ",";

		String[] substring = nums.split(spliter);
		int numArray[] = new int[substring.length];

		for (int i = 0; i < substring.length; i++) {
			numArray[i] = Integer.parseInt(substring[i]);
		}

		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum = sum + numArray[i];
		}
		System.out.println("Ваше среднее число = " + sum / numArray.length);

		sc.close();
	}

}
