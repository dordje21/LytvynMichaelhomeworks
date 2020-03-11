package com.gmail.lesson11;

import java.util.*;

public class ArrayList<T> implements List<T> {

	private Object[] objects = new Object[0];

	@Override
	public int size() {

		return objects.length;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public boolean contains(Object o) {

		for (Object each : objects) {
			if (each.equals(o)) {
				return true;
			}

		}

		return false;
	}

	@Override
	public Object[] toArray() {
		Object[] newObj = objects.clone();
		return newObj;
	}

	@Override
	public boolean add(T o) {
		int size = size();

		Object[] temp = new Object[size + 1];
		for (int i = 0; i < objects.length; i++) {
			temp[i] = objects[i];
		}
		temp[size] = o;
		objects = temp;

		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean remove(Object o) {

		Object[] temp = objects;
		objects = new Object[0];

		for (int i = 0; i < temp.length; i++) {
			if (!temp[i].equals(o)) {
				add((T) temp[i]);
			}
		}
		return true;
	}

	@Override
	public void clear() {
		objects = new Object[0];
	}

	@SuppressWarnings("unchecked")
	T myElement(int index) {
		return (T) objects[index];
	}

	@Override
	public T get(int index) {

		if (size() <= index) {
			throw new IndexOutOfBoundsException("");

		}
		T getObj = myElement(index);

		return getObj;
	}

	@Override
	public T set(int index, T element) {

		if (size() <= index) {
			throw new IndexOutOfBoundsException("");
		}

		@SuppressWarnings("unused")
		T getObj = myElement(index);

		return getObj = (T) element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(int index, T element) {
		int size = size();

		T[] temp = (T[]) new Object[size + 1];

		for (int i = 0; i < temp.length; i++) {
			if (index == i) {
				temp[index] = element;

			} else {

				if (i > index) {
					temp[i] = (T) objects[i - 1];
				} else {
					temp[i] = (T) objects[i];
				}
			}
		}

		objects = (T[]) temp;

	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {

		if (size() <= index) {
			throw new IndexOutOfBoundsException("");

		}

		T[] temp = (T[]) objects;

		T oldObj = (T) objects[index];
		objects = (T[]) new Object[0];

		for (int i = 0; i < temp.length; i++) {
			if (i != index) {
				add(temp[i]);
			}
		}
		return oldObj;
	}

	@Override
	public int indexOf(Object o) {

		for (int i = 0; i < objects.length; i++) {
			if (objects[i].equals(o)) {
				return i;
			}
		}

		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		return -1;
	}

	@Override
	public ListIterator<T> listIterator() {

		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		return null;
	}

	public boolean retainAll(ArrayList<?> arr) {

		for (Object o : objects) {
			if (!arr.contains(o)) {
				remove(o);
			}
		}
		return true;
	}

	public boolean containsAll(@SuppressWarnings("rawtypes") ArrayList arr) {
		for (Object o : arr) {
			if (!contains(o)) {
				return false;
			}
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray(Object[] o) {
		return new Object[0];
	}

	@Override
	public String toString() {
		return "Box {" + "objects=" + Arrays.toString(objects) + '}';
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

}