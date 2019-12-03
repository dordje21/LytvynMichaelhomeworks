package com.gmail.lesson2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("введите число, что-бы определить четное оно или нет");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("четное");
		} else {
			System.out.println("не четное");
		}

		System.out.println("введите число, что-бы определить простое ли оно");
		int b = sc.nextInt();
		if (b%b == 0 && b%2 != 0) {
			System.out.println("число простое");
		} else {
			System.out.println("число состовное");
		}

		System.out.println("введите число что-бы узнать чему оно кратно");
		int c = sc.nextInt();
		for (int i = 1; i < c; i++) {
			if(c%i == 0) {
				System.out.println(c/i);
			}
		}

		sc.close();
	}

}
