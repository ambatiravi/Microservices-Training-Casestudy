package com.example.Book.Library.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Book.Library.entity.Book;
import com.example.Book.Library.entity.Subscription;
import com.example.Book.Library.repository.BookLibrararyRepository;
import com.example.Book.Library.repository.SubscriptionRepository;

@Service
public class Bookservice {
	
	@Autowired
	BookLibrararyRepository booklibraryrepository;
	
	@Autowired
	SubscriptionRepository subscriptionRepository;
	
	public Book getBook(Integer bookid) {
		Optional<Book> book = booklibraryrepository.findById(bookid);
		return book.isPresent() ? book.get() : null;
	}
	
	
	public Book getBookByauthor(String author) {
		Book book = booklibraryrepository.getBookByauthor(author);
		return book;
	}
	
	public List<Subscription> getSubscription(){
		List<Subscription> subcrib = subscriptionRepository.findAll();
		return subcrib;
	}
	
	public Subscription createSubscription(Subscription subscrip) {
		Subscription subcri = subscriptionRepository.save(subscrip);
		return subcri;

	}
}
