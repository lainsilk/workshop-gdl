package com.recluit.labb.action;

import java.util.Scanner;

import com.opensymphony.xwork2.ActionSupport;
import com.recluit.labb.model.Book;
import com.recluit.labb.model.BookStore;
import com.recluit.labb.restclient.BookRestClient;
import com.recluit.labb.restclient.HelloClient;


public class BookAction extends ActionSupport{

	private static final long serialVersionUID = 8309998795879062875L;
	
	private BookStore bookStore;
	private String bookQuery;
	private String bookResultTitle;
	private String bookResultAuthor;
	private String bookResult;
	//<-FOR BOOK CLIENT->
	//	public String execute() throws Exception{
//		bookStore = new BookStore();
//		for(Book book : bookStore.getAllBooks()){
//			
//			if (book.getTitle().equals(bookQuery))
//			{
//				HelloClient helloClient = new HelloClient();
//				bookResultTitle = helloClient.getMessage();
//				//bookResultTitle = book.getTitle();
//				bookResultAuthor = book.getAuthor();
//				return SUCCESS;
//			}
//		}
//		return ERROR;
//	}
	
	// <- FOR BOOK CLIENT ->
	public String execute() throws Exception{
		BookRestClient bookRestClient = new BookRestClient();
		bookResult = bookRestClient.findBookBytitle(bookQuery);
		
			
			if (bookResult != null)
			{
				Scanner scanner = new Scanner(bookResult);
				scanner.useDelimiter(",");
				bookResultTitle = scanner.next();
				bookResultAuthor = scanner.next();
				scanner.close();
				return SUCCESS;
			}else{
		
		return ERROR;}
	}

	public BookStore getBookStore() {
		return bookStore;
	}

	public void setBookStore(BookStore bookStore) {
		this.bookStore = bookStore;
	}

	public String getBookQuery() {
		return bookQuery;
	}

	public void setBookQuery(String bookQuery) {
		this.bookQuery = bookQuery;
	}

	public String getBookResultTitle() {
		return bookResultTitle;
	}

	public void setBookResultTitle(String bookResultTitle) {
		this.bookResultTitle = bookResultTitle;
	}

	public String getBookResultAuthor() {
		return bookResultAuthor;
	}

	public void setBookResultAuthor(String bookResultAuthor) {
		this.bookResultAuthor = bookResultAuthor;
	}
	
	

}

