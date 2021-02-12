package com.example.openshiftdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.openshiftdemo.persistence.entity.Book;
import com.example.openshiftdemo.persistence.repository.IBookRepository;

@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
	private IBookRepository bookRepository;


	@GetMapping
	@ResponseStatus()
	public Book get() {
		return new Book("title" , "author");
	}
	@PostMapping
	@ResponseStatus()
	public Book create(@RequestBody Book book) {
		return bookRepository.save(book);
	}
}
