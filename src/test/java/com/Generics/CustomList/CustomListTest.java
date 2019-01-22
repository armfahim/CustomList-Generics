package com.Generics.CustomList;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomListTest {

	@Test
	public void testAdd() {
		CustomList<Book> list = new CustomList<Book>();
		list.add(new Book("C", "Herber Schield", "12/11/2010", 500.12, 3500.0));
		Book b = new Book("C", "Herber Schield", "12/11/2010", 500.12, 3500.0);

		assertEquals(b.toString(), list.toString());
	}

	@Test
	public void testGet() {
		CustomList<Book> list = new CustomList<Book>();
		list.add(new Book("C", "Herber Schield", "12/11/2010", 500.12, 3500.0));
		list.add(new Book("Oracle", "Java: A Beginner’s Guide", "07/11/2012", 3452.22, 2500.0));
		Book b = new Book("Oracle", "Java: A Beginner’s Guide", "07/11/2012", 3452.22, 2500.0);

		assertEquals(b.toString(), list.get(1).toString());
	}

	@Test
	public void testRemove() {
		CustomList<Book> list = new CustomList<Book>();
		list.add(new Book("C", "Herber Schield", "12/11/2010", 500.12, 3500.0));
		list.add(new Book("Oracle", "Java: A Beginner’s Guide", "07/11/2012", 3452.22, 2500.0));
		Book b = new Book("Oracle", "Java: A Beginner’s Guide", "07/11/2012", 3452.22, 2500.0);
		list.remove(0);

		assertEquals(b.toString(), list.get(0).toString());
	}

	@Test
	public void testSize() {
		CustomList<Book> list = new CustomList<Book>();
		list.add(new Book("C", "Herber Schield", "12/11/2010", 500.12, 3500.0));
		list.add(new Book("Oracle", "Java: A Beginner’s Guide", "07/11/2012", 3452.22, 2500.0));
		
		assertEquals(list.size(), 2);
	}

}
