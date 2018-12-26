package com.example.redis;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.redis.model.Book;
import com.example.redis.service.BookService;

@SpringBootApplication
public class RedisSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSampleApplication.class, args);
	}


	@RestController
	class Controller {
		
		@Autowired
		private BookService bookService;
		
		@PostMapping("/book")
		public Book createBook(@RequestBody Book book) {
			bookService.createBook(book);
			
			return book;
		}
		
		@GetMapping("/book/{id}")
		public Optional<Book> findBookById(@PathVariable String id) {
			return bookService.findBookById(id);
		}
		
		@GetMapping("/book/all")
		public Iterable<Book> findAllBook() {
			return bookService.findAllBook();
		}
	}
}

