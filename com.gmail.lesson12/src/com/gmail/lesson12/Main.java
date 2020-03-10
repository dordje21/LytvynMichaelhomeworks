package com.gmail.lesson12;

public class Main {

	public static void main(String[] args) {

		MyTreeSet set = new MyTreeSet();

		set.add(33);
		set.add(12);
		set.add(43);

		System.out.println(set.contain(43));
		System.out.println(set.contain(4));
		System.out.println(set.contain(12));
		System.out.println(set.contain(33));
	}

}
