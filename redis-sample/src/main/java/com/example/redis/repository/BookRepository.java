package com.example.redis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.redis.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {

}
