package com.springMongo.MongoDBspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springMongo.MongoDBspring.model.Book;


public interface BookRepository extends MongoRepository<Book, Integer> {

}

