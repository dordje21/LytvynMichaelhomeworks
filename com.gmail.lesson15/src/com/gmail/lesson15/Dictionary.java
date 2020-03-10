package com.gmail.lesson15;

public class Dictionary {

	private int length = 1000;
	private Entry[] array = new Entry[length];

	public String get(String key) {
		try {
			int hash = index(key);
			if (array[hash] != null) {
				Entry current = array[hash];
				while (true) {
					if (current.key.equals(key)) {
						return current.value;
					}
					current = current.next;
				}
			}
			return array[hash].value;
		} catch (Exception e) {
			return "wrong key, try again!";
		}
		
	}

	public void add(String key, String value) {

		Entry entry = new Entry(key, value);
		int number = index(key);
		add(entry, number);
	}

	public boolean add(Entry o, int index) {

		Entry[] temp = array;
		temp[index] = o;
		array = temp;

		return true;
	}

	private static class Entry {
		String key;
		String value;
		Entry next;

		public Entry(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	private int index(Object o) {

		int hash = o.hashCode();

		hash = Math.abs(hash);
		if (length != 0) {
			hash = hash % length;
		} else {
			hash = hash % 1;

		}
		return hash;
	}

	@Override
	public String toString() {

		String head = "Dictionary = {";

		Dictionary.Entry[] current = array;

		for (Dictionary.Entry curr : current) {
			if (curr == null) {
				head += "";
			}
			while (curr != null) {
				head += " (" + curr.key + ", " + curr.value + ") /";
				curr = curr.next;
			}
		}
		return head + '}';
	}
}