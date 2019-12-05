package com.gmail.lesson3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//метод получения точек прямоугольника
		getpoints();
		
	}

	private static void getpoints() {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("введите коардинаты прямоугольника x1 y1 и x2 y2");

		System.out.println("введите x1");
		int x1 = sc.nextInt();

		System.out.println("введите y1");
		int y1 = sc.nextInt();

		System.out.println("введите x2");
		int x2 = sc.nextInt();

		System.out.println("введите y2");
		int y2 = sc.nextInt();

		System.out.println("введите коардинаты точки что-бы узнать в прямоугольнике она или нет");

		System.out.println("введите x");
		int x = sc.nextInt();

		System.out.println("введите y");
		int y = sc.nextInt();
		
		sc.close();
		
		//метод определения нахождения точки 
		checkthepoint(x1, y1, x2, y2, x, y);
	}

	private static void checkthepoint(int x1, int y1, int x2, int y2, int x, int y) {
		if(x>=x1 && x<=x2 && y >=y1 && y<=y2) {
			System.out.println("Принадлежит прямоугольнику");
		} else {
			System.out.println("Не пренадлежит");
		}
	}

}
