package com.Generics.CustomList;
import java.util.Arrays;

public class CustomList<E> {

	private int size = 0;
	private static final int CAPACITY = 1;
	private Object elements[];

	public CustomList() {
		elements = new Object[CAPACITY];
	}

	public void add(E e) {
		if (size == elements.length)
			increase();

		elements[size++] = e;
	}

	private void increase() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);

	}

	public E get(int i) {
		if (i >= size || i < 0)
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		return (E) elements[i];
	}

	public E remove(int i) {
		if (i >= size || i < 0)
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		Object item = elements[i];

		int numElts = elements.length - (i + 1);
		System.arraycopy(elements, i + 1, elements, i, numElts);
		size--;
		return (E) item;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < size; i++) {
			b.append(elements[i].toString());
			if (i < size - 1)
				b.append("\n");
		}
		return b.toString();
	}
}

