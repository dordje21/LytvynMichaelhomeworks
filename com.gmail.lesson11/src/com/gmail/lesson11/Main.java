package com.gmail.lesson11;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> box = new ArrayList<Integer>();

		ArrayList<Integer> box2 = new ArrayList<Integer>();

		box.add(2);
		box.add(7);
		box.add(6);
		box.add(5);
		box.add(4);
		box.add(3);

		System.out.println("box hasNext? =  " + box.iterator().hasNext());
		System.out.println("box next? =  " + box.iterator().next());
		
		 while(box.iterator().hasNext()){
	            System.out.println(box.iterator().next());
	        }

		System.out.println("box1 size: " + box.size());
		print(box);

		box2.add(5);
		box2.add(3);
		box2.add(11);
		box2.add(12);

		System.out.println("box2 size: " + box2.size());
		print(box2);

		System.out.println("box1 remove element 4 ");
		box.remove(4);
		print(box);

		print("contain: " + 4 + " " + box.contains(5));
		print("contain: " + 3 + " " + box.contains(4));

		print("size: " + box.size());

		box.add(5);
		print(box);

		print(box2);

		print("empty box2: " + box2.isEmpty());
		print("null: " + (box2 == null));

		box.add(1, 69);

		print("add index 1: " + box);

		box.retainAll(box2);
		print(box);

		box.add(15);
		print(box);
		print(box2);

		box.clear();
		print(box);
		print("empty box1: " + box.isEmpty());

	}

	static void print(Object o) {
		System.out.println(o);
	}
}
