package com;

import com.model.Author;
import com.model.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setTitle("Complete Java");
		Author author = new Author();
		author.setAuthor("Harry potter");
		System.out.println(author);
		book.setAuthor("Herbert Schildt");
		System.out.println(book);
		
		
		Book book1 = new Book();
		book.setTitle("Complete Java");
		Author author1 = new Author();
		author.setAuthor("Harry potter Boook 2");
		System.out.println(author);
		book.setAuthor("Herbert Schildt");
		System.out.println(book);
	}

}
