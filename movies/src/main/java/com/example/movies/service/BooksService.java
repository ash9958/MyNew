package com.example.movies.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.movies.entity.Books;
import com.example.movies.entity.Movie;

@Service
public class BooksService {

	private List<Books> booksdata = new ArrayList<Books>(Arrays.asList(

			new Books(1, "Concept Of Physics", "H.C Verma"), 
			new Books(2, "Concept Of Physics 2", "H.C Verma")

	));
	private List<Movie> booksdata2 = new ArrayList<>(Arrays.asList(

			new Movie(1l, "Avengers", "ybdb", false, 24-07-2020, "Eng",
					true)
	));

	public List<Books> getAllBooks() {
		return booksdata;

	}

	public void addBooks(Books books)
	{
		booksdata.add(books);
	}
	
}
