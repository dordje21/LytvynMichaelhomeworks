package com.gmail.cresedel211194.calculator;

public class Takein {
	private String num;
	private int a;
	private int b;
	private char d;

	public Takein(String num) {
		super();
		this.num = num;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public char getD() {
		return d;
	}

	public void setD(char d) {
		this.d = d;
	}

	public void takeAndCalc() {
		String s[] = num.split(" ");
		String rome[] = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
		int chek = 0;

		if (s.length < 4) {
			for (String row : rome) {
				if (row.equals(s[0])) {
					for (String row2 : rome) {
						if (row2.equals(s[2])) {
							setA(RomanNumeral.romanToArabic(s[0]));
							setB(RomanNumeral.romanToArabic(s[2]));
							String ss = s[1];
							setD(ss.charAt(0));
							if (getA() <= 10 && getB() <= 10) {
								System.out.println(RomanNumeral.arabicToRoman(Calculator.calc(getA(), getB(), getD())));
							} else {
								System.out.println("ошибка! числа больше 10 не принимаются");
								break;
							}
							chek = 2;
						}
					}
					chek = 1;
				}
			}
			if (chek == 0) {
				try {
					String ss = s[1];
					setD(ss.charAt(0));
					setA(Integer.parseInt(s[0]));
					setB(Integer.parseInt(s[2]));
					if (getA() <= 10 && getB() <= 10) {
						System.out.println(Calculator.calc(getA(), getB(), getD()));
					} else {
						System.out.println("ошибка! числа больше 10 не принимаются");
					}
				} catch (Exception e) {
					System.out.println("ошибка! число больше 10 либо не верный формат");
				}
			}

		} else {
			System.out.println("Условие не правильное");
		}
	}

}
