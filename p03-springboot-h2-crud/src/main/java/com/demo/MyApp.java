package com.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Book;
import com.demo.services.BookService;

@SpringBootApplication
public class MyApp implements CommandLineRunner {

//	private BookServcie service = new BookServcie();
	
	@Autowired
	private BookService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		saveAll();
		findAll();
		getById();
		
	}

	private void getById() {
		int findId = 2;
		Book foundBook = service.getBookById(findId);
		System.out.println("Found Book: "+foundBook);
	}

	private void findAll() {
		List<Book> allBooks = service.fetchAllBooks();
		System.out.println(allBooks);
	}

	private void saveAll() {
		List<Book> books = Arrays.asList(
				new Book("Superman", "John", 24),
				new Book("Batman", "Miley", 15),
				new Book("Shaktiman", "Mukesh", 29),
				new Book("Hanuman", "Maruti", 35)
		);

		books.forEach(book->{
			Book savedBook = service.createBook(book);
			System.out.println(savedBook);
		});
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}
	
}
