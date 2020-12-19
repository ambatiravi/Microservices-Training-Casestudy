package com.example.Book.Library.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subscription implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long bookid;
	private String subscriptionname;
	public Long getBookid() {
		return bookid;
	}
	public void setBookid(Long bookid) {
		this.bookid = bookid;
	}
	public String getSubscriptionname() {
		return subscriptionname;
	}
	public void setSubscriptionname(String subscriptionname) {
		this.subscriptionname = subscriptionname;
	}
	public String getDatesubcribed() {
		return datesubcribed;
	}
	public void setDatesubcribed(String datesubcribed) {
		this.datesubcribed = datesubcribed;
	}
	public String getDatereturned() {
		return datereturned;
	}
	public void setDatereturned(String datereturned) {
		this.datereturned = datereturned;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String datesubcribed;
	private String datereturned;
	
}
