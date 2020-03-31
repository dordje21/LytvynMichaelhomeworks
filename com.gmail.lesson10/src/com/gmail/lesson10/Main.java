package com.gmail.lesson10;

public class Main {

	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();

		System.out.println("НЕ Добавляли обьекты");
		System.out.println("myLinkedList isEmpty = " + myLinkedList.isEmpty());

		myLinkedList.add(12);
		
		System.out.println("Добавили 1 обьект");
		System.out.println("myLinkedList isEmpty = " + myLinkedList.isEmpty());
		
		myLinkedList.add(1);
		myLinkedList.add(4);
		myLinkedList.add(5);

		System.out.println("Добавили обьекты");

//		System.out.println("myLinkedList isEmpty = " + myLinkedList.isEmpty());

		MyLinkedList arr = new MyLinkedList();

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
