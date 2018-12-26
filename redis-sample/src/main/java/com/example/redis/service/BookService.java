package com.example.redis.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.redis.model.Book;
import com.example.redis.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	public void createBook(Book book) {
		bookRepo.save(book);
	}

	public Optional<Book> findBookById(String id) {
		return bookRepo.findById(id);
	}

	public Iterable<Book> findAllBook() {
		return bookRepo.findAll();
	}
}
