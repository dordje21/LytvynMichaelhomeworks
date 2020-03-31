package com.gmail.lesson11;

import java.util.Iterator;

public class MyIterator implements Iterator<Object> {

	public MyIterator iterator() {
		return new MyIterator() {
			private Node first;
			private Node current = first;

			@Override
			public boolean hasNext() throws NullPointerException{
				return current.hasNext();
			}

			@Override
			public Object next() throws IndexOutOfBoundsException {
				Object result = current;
				if (!current.hasNext())
					throw new IndexOutOfBoundsException("End of list.");
				current = current.getNext();
				return result;
			}
		};
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

}