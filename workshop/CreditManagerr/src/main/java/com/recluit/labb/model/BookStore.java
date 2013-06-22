package com.recluit.labb.model;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

	private List<Book> allBooks;
	
	//Simulating a DB
	
	public BookStore(){
		allBooks = new ArrayList<Book>();
		allBooks.add(new Book("Sherlom Holms","Sir Arthur Connan Doyle"));
		allBooks.add(new Book("Le Parfum","patrick Suskind"));
	}

	public List<Book> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(List<Book> allBooks) {
		this.allBooks = allBooks;
	}
	
	
	
}
