package com.gmail.cresedel211194.calculator;

public class Calculator {

	public void plus(int i, int j) {
		System.out.println(i + j);
	}

	public void minus(int i, int j) {
		System.out.println(i - j);
	}

	public static int calc(int i, int j, char h) {
		int answer = 0;

		if (i <= 10 && j <= 10) {

			if (h == '+') {
				answer = i + j;

			} else if (h == '-') {
				answer = i - j;

			} else if (h == '*') {
				answer = i * j;

			} else if (h == '/') {
				try {
					answer = i / j;
				} catch (Exception e) {
					System.out.print("ошибка! нельзя делить на ");
				}
			} else {
				System.out.println("ошибка! не правельный знак");
			}
		} else {
			System.out.println("ошибка! числа больше 10 не принимаются");
		}
		return answer;
	}

}
