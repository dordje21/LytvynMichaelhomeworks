package com.gmail.cresedel211194.calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("введите числа в виде 1 + 2 или VI / III");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		Takein take = new Takein(num);
		take.takeAndCalc();
		sc.close();
	}

}
