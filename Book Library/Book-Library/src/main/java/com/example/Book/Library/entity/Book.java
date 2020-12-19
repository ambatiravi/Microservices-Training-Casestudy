package com.example.Book.Library.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer book_id;
	private String book_name;
	private String author;
	private String available_copies;
	private String total_copies;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getAvailable_copies() {
		return available_copies;
	}
	public void setAvailable_copies(String available_copies) {
		this.available_copies = available_copies;
	}
	public String getTotal_copies() {
		return total_copies;
	}
	public void setTotal_copies(String total_copies) {
		this.total_copies = total_copies;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
}
