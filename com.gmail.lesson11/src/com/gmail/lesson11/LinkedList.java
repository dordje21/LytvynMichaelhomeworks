package com.gmail.lesson11;

import java.util.*;

public class LinkedList implements List {

	private Node head;

	private int cache;

	@Override
	public int size() {

		return cache;
	}

	@Override
	public boolean isEmpty() {

		return head.getNext() == null;
	}

	@Override
	public boolean contains(Object o) {

		Object[] arr = toArray();
		if (!isEmpty()) {
			for (int i = 0; i < cache; i++) {
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
	public Iterator iterator() {
		return iterator();
	}

	@Override
	public Object[] toArray() {

		Object[] result = new Object[cache];
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
			cache = 1;
			return true;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
			cache++;
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
			cache--;
			return true;
		}

		Node prev;
		Node current = head;

		while (current.getNext() != null) {
			prev = current;
			current = current.getNext();
			if (current.getObject().equals(o)) {
				prev.setNext(current.getNext());
				cache--;
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean addAll(Collection c) {

		Object[] cc = c.toArray();

		for (int i = 0; i < cc.length; i++) {
			add(cc[i]);
		}

		return true;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		return false;
	}

	@Override
	public void clear() {
		cache = 0;
		head = new Node(null, null);

	}

	@Override
	public Object get(int index) {

		if (cache <= index) {
			throw new IndexOutOfBoundsException("");
		}

		Object[] cc = toArray();

		for (int i = 0; i < cc.length; i++) {
			if (i == index) {
				return cc[i];
			}
		}

		return true;

	}

	@Override
	public Object set(int index, Object element) {
		if (cache <= index) {
			throw new IndexOutOfBoundsException("");
		}

		Object[] cc = toArray();

		for (int i = 0; i < cc.length; i++) {
			if (i == index) {
				cc[i] = element;
			}
		}

		return true;
	}

	@Override
	public void add(int index, Object element) {

	}

	@Override
	public Object remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		return null;
	}

	@Override
	public boolean retainAll(Collection c) {
		Object[] cc = c.toArray();
		Object[] myArr = toArray();

		for (int i = 0; i < cache; i++) {
			if (!c.contains(myArr[i])) {
				remove(myArr[i]);
			}
		}

		return true;
	}

	@Override
	public boolean removeAll(Collection c) {
		Object[] cc = c.toArray();

		for (int i = 0; i < cc.length; i++) {
			remove(cc[i]);
		}

		return true;
	}

	@Override
	public boolean containsAll(Collection c) {

		Object[] arr = c.toArray();

		for (int i = 0; i < arr.length; i++) {
			if (!contains(arr[i])) {
				return false;
			}
		}

		return true;
	}

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