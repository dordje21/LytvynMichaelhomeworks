package com.gmail.cresedel211194;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleas input first number:");
		double a = sc.nextInt();
		System.out.println("Your input " + a + " as a first number");
		System.out.println("Pleas input second number:");
		double b = sc.nextInt();
		sc.close();
		System.out.println("Your input " + a + " as a second number");
		double sum = a + b;
		System.out.println("Your");
		System.out.println("Sum is " + sum);
		double dif = a - b;
		System.out.println("Difference is " + dif);
		double div;
		if (b > 0) {
			div = a / b;
			System.out.println("Division is " + div);
		} else {
			System.out.println("Деление на 0 не доступно");
		}
		double mul = a * b;
		System.out.println("Multiplication is " + mul);
	}

}