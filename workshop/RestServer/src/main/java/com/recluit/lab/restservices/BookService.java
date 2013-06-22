package com.recluit.lab.restservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Path;

import com.recluit.labb.model.Book;
import com.recluit.labb.model.BookStore;


@Path("/book")
public class BookService {
	
	@GET
	@Path("/{title}")
	@Consumes(MediaType.TEXT_PLAIN)
	public String getBook(@PathParam("title")String title)
	{
		System.out.println("Book to query: "+title);
		BookStore bookStore = new BookStore();
		for (Book book : bookStore.getAllBooks()){
			if (title.equals(book.getTitle())){
				System.out.println("Book Found! : "+book);
				String result = book.getTitle()+","+book.getAuthor();
				return result;
			}
		}
		
		return null;
	}

}
