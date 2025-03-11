package com;

import com.model.Book;

public class Main {
	public static void main(String[] args) {
		Book book=new Book();
		book.setTitle("ABC");
        book.setAuthor("XYZ");
        System.out.println("Book1 "+ book);
        Book book2 = new Book();
        book2.setTitle("java");
        book2.setAuthor("xyz");
        System.out.println("Book2 "+ book2);
	}
}
