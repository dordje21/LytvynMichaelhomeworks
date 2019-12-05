package com.gmail.lesson3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String num1 = "123";
		String num2 = "202";

		int sum1 = yoursum(num1);
		int sum2 = yoursum(num2);

		System.out.println(sum1);
		System.out.println(sum2);

	}

	private static int yoursum(String num1) {
		int sum = 0;
		char[] arr = num1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			
			sum += Integer.parseInt(String.valueOf(arr[i]));
		}
		return sum;
	}

}
