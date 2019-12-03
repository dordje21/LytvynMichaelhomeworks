package com.gmail.lessoncom.gmail.lesson;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("введите число 1");
		double a = sc.nextInt();
		System.out.println("введите число 2");
		double b = sc.nextInt();

		double c = (a + b) / 2;

		System.out.println("среднее число = " + c);

		sc.close();
	}

}
