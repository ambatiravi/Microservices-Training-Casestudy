package com.example.Book.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Book.Library.entity.Book;


public interface BookLibrararyRepository extends JpaRepository<Book, Integer>{
	
	@Query(value = "select * from Book where author = :author", nativeQuery = true)
	Book getBookByauthor(@Param(value = "author") String author);


}
