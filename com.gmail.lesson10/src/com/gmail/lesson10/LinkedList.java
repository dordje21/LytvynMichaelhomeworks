package com.gmail.lesson10;

import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;

public class LinkedList implements Collection<Object> {

	private Node head;

	private int cacheSize;

	@Override
	public int size() {

		return cacheSize;
	}

	@Override
	public boolean isEmpty() {
		if (head.getNext() == null) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean contains(Object o) {

		Object[] arr = toArray();
		if (!isEmpty()) {
			for (int i = 0; i < cacheSize; i++) {
				if (arr[i] == o) {
					return true;
				}
			}

		} else {
			throw new EmptyStackException();
		}

		return false;
	}

	@Override
	public Iterator<Object> iterator() {
		return iterator();
	}

	@Override
	public Object[] toArray() {

		Object[] result = new Object[cacheSize];
		int i = 0;

		for (Node node = head; node != null; node = node.getNext()) {
			result[i++] = node.getObject();
		}
		return result;

	}

	@Override
	public boolean add(Object o) {
		Node node = new Node(o, null);

		if (head == null) {
			head = node;
			cacheSize = 1;
			return true;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
			cacheSize++;
		}
		return true;
	}

	@Override
	public boolean remove(Object o) {
		if (o == null) {
			return false;
		}
		if (head == null) {
			return false;
		}
		if (head.getObject().equals(o)) {

			head = head.getNext();
			cacheSize--;
			return true;
		}

		Node prev;
		Node current = head;

		while (current.getNext() != null) {
			prev = current;
			current = current.getNext();
			if (current.getObject().equals(o)) {
				prev.setNext(current.getNext());
				cacheSize--;
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean addAll(Collection<?> c) {

		Object[] o = c.toArray();

		for (int i = 0; i < o.length; i++) {
			add(o[i]);
		}

		return true;
	}

	@Override
	public void clear() {
		cacheSize = 0;
		head.setNext(null);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		Object[] myArr = toArray();

		for (int i = 0; i < cacheSize; i++) {
			if (!c.contains(myArr[i])) {
				remove(myArr[i]);
			}
		}

		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		Object[] o = c.toArray();

		for (int i = 0; i < o.length; i++) {
			remove(o[i]);
		}

		return true;
	}

	@Override
	public boolean containsAll(Collection<?> c) {

		Object[] arr = c.toArray();

		for (int i = 0; i < arr.length; i++) {
			if (!contains(arr[i])) {
				return false;
			}
		}

		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray(Object[] a) {
		return new Object[0];
	}

	@Override
	public String toString() {
		String result = "[";

		Node current = head;

		while (current != null) {
			result += current.getObject() + ", ";
			current = current.getNext();

		}

		return result + "]";
	}
}