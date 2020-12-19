package com.example.Book.Library.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Book.Library.Service.Bookservice;
import com.example.Book.Library.entity.Book;
import com.example.Book.Library.entity.Subscription;

@RestController
public class Booklibrarycontroler {

	@Autowired
	private Bookservice bookservice;
	
	@GetMapping("/books/{bookid}")
	public Book getbook(@PathVariable Integer bookid) {
		return bookservice.getBook(bookid);
		
	}
	@GetMapping("/{author}")
	public Book getbookByauthor(@PathVariable String author) {
		return bookservice.getBookByauthor(author);

	}
	@GetMapping("/subscriptions")
	public List<Subscription> getSubscriptions() {
		return bookservice.getSubscription();

	}

	@PostMapping("/subscription")
	public Subscription createSubscription(@RequestBody Subscription subscription) {
		return bookservice.createSubscription(subscription);
	}

	/*@GetMapping("/subscriptions/{subscriptionname}")
	public Subscription getSubscription(@RequestBody String subscriptionname) {
		return bookservice.subscriptionByname(subscriptionname);
	}*/
	
}
