package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Book;
import com.demo.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repo;
	
	public BookService() {
		System.out.println("BookService init");
	}

	public List<Book> fetchAllBooks(){
		System.out.println("find all books");
		return repo.findAll();
	}
	public Book getBookById(int id) {
		Optional<Book> optional = repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		} else {		
			System.out.println("Could not find book with id "+id);
			return null; // throw ex
		}
	}
	public void deleteBookById(int id) {
		Optional<Book> optional = repo.findById(id);
		if(optional.isPresent()) {
			 repo.deleteById(id);
		} else {		
			System.out.println("Could not find book with id "+id);
			 // throw ex
		}
	}
	public Book createBook(Book b) {
		return repo.save(b);
		
	}
	
	public Book updateExistingBook(Book b) {
		Optional<Book> optional = repo.findById(b.getId());
		if(optional.isPresent()) {
			return repo.save(b);
		} else {		
			System.out.println("Could not find book with id "+b.getId());
			return b;
		}
		
		
	}
	
}
