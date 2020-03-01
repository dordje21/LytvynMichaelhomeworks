package com.gmail.lesson10;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();

		myLinkedList.add(12);
		myLinkedList.add(1);
		myLinkedList.add(4);
		myLinkedList.add(5);

		LinkedList<Integer> arr = new LinkedList<Integer>();
		arr.add(123);
		arr.add(5);
		arr.add(6);
		arr.add(12);

		myLinkedList.addAll(arr);

		print(myLinkedList);

		print(myLinkedList.size());

		myLinkedList.removeAll(arr);
		print(myLinkedList);

		print(myLinkedList.contains(3));
		print(myLinkedList.contains(4));

		print(myLinkedList.containsAll(myLinkedList));

		print(myLinkedList.containsAll(arr));

		myLinkedList.retainAll(arr);

		print(myLinkedList);

	}

	private static void print(Object o) {
		System.out.println(o);
	}

}
