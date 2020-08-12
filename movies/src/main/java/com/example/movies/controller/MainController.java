package com.example.movies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movies.entity.Books;
import com.example.movies.service.BooksService;

@RestController
public class MainController {

	@Autowired
	BooksService mybook;
	@GetMapping("/")
	public String Hello()
	{
		return "Hello";
	}

	@GetMapping("/books")
	public List<Books> getAllBooks()
	{
		return mybook.getAllBooks();
	}
}
