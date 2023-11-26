package com.example.MySql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MySql.model.Book;
import com.example.MySql.repo.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@PostMapping("/bookSave")
	public String insertBook(@RequestBody Book book) {
		bookRepository.save(book);
		return "Your record is saved succesfully !!";
		
	}
	
	@PostMapping("/multipleBookSave")
	public String insertBook(@RequestBody List<Book> book) {
		bookRepository.saveAll(book);
		return "Record is saved succesfully ||";
		

}
}