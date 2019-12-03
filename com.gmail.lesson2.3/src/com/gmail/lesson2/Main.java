package com.gmail.lesson2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("введите сумму вклада");
		double a = sc.nextDouble();
		System.out.println("введите % годовых");
		double b = sc.nextDouble();
		System.out.println("введите количество лет");
		double c = sc.nextDouble();
		
		double procent = a * b / 100;
		
		double sum = procent * c;
		
		System.out.println("вы заработаете " + sum + "грн.");
	}

}
