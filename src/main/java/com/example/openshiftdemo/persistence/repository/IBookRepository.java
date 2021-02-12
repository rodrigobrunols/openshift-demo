package com.example.openshiftdemo.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.openshiftdemo.persistence.entity.Book;

public interface IBookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
    Book save(Book book);
}