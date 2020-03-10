package com.gmail.lesson15;

public class Main {
	public static void main(String[] args) {
		Dictionary myMap = new Dictionary();

		myMap.add("Michael", "Михаил");
		myMap.add("Michael2", "Михаил2");
		myMap.add("Michael3", "Михаил3");
		myMap.add("Eva", "Ева");
		myMap.add("Eva2", "Ева2");
		myMap.add("Eva3", "Ева3");

		System.out.println(myMap);
		System.out.println(myMap.get("Michael"));
		System.out.println(myMap.get("Eva"));
		System.out.println(myMap.get("Ева3"));
	}
}