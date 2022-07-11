package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Book;

//@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

//		List<Book> findAll();
//		Book findById(int id);
//		Book save(Book m);

	// handson -> homework -> task -> find alternate
//		Book update(int id, Book m);
//		void deleteById(int id);
	
}

//interface MovieRepository{
//	List<Movie> findAll();
//	Movie findById(int id);
//	Movie save(Movie m);
//	Movie update(int id, Movie m);
//	void deleteById(int id);
//}
//
//interface PaymentRepository{
//	List<Payment> findAll();
//	Payment findById(int id);
//	Payment save(Payment m);
//	Payment update(int id, Payment m);
//	void deleteById(int id);
//}
