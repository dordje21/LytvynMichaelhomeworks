package com.gmail.lesson12;

import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import org.eclipse.jdt.annotation.NonNull;

@SuppressWarnings("rawtypes")
public class MyTreeSet implements Set {
	private Node root;

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	public boolean contain(Object o) {
		if (root.getData() == o) {
			return true;
		}
		return searchRecuresive(root, o);
	}

	private boolean searchRecuresive(Node Root, Object o) {
		Integer oInt = (Integer) o;

		Integer currentInt = (Integer) Root.getData();

		if (oInt > currentInt) {
			if (Root.getRight() == null) {
				return false;
			} else if (Root.getRight().getData() == (o)) {
				return true;
			}

			return searchRecuresive(Root.getRight(), o);

		} else if (oInt < currentInt) {
			if (Root.getLeft() == null) {
				return false;
			} else if (Root.getLeft().getData() == o) {
				return true;
			}
			return searchRecuresive(Root.getLeft(), o);
		}
		return false;
	}

	@NonNull
	@Override
	public Iterator iterator() {
		return null;
	}

	@Override
	public boolean add(Object o) {
		Node node = new Node(o);
		if (root == null) {
			root = node;
			return true;
		}
		return addRecursiveToTree(root, o);
	}

	private boolean addRecursiveToTree(Node Root, Object o) {
		Integer oInt = (Integer) o;

		Integer currentInt = (Integer) Root.getData();

		if (oInt > currentInt) {
			if (Root.getRight() == null) {
				Root.setRight(new Node(o));
				return true;
			}

			return addRecursiveToTree(Root.getRight(), o);
		} else if (oInt < currentInt) {
			if (Root.getLeft() == null) {
				Root.setLeft(new Node(o));
				return true;
			}
			return addRecursiveToTree(Root.getLeft(), o);
		}
		return false;
	}
	
	@NonNull
	@Override
	public Object[] toArray() {
		return new Object[0];
	}

	@NonNull
	@Override
	public Object[] toArray(@NonNull Object[] a) {
		return new Object[0];
	}

	public static class Node {
		private Object data;
		private Node node, left, right;

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node(Object data) {
			this.data = data;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Node getNode() {
			return node;
		}

		public void setNode(Node node) {
			this.node = node;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}
	}

	@Override
	public String toString() {

		String result = "[";
		Node cur = root;

		while (cur != null) {
			result += cur.getData() + ", ";
			cur = cur.getRight();

		}

		return result + "]";
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}