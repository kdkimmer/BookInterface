package com.springapp.mvc.controller;

import com.springapp.mvc.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;

@Controller
public class BookController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Click here for a List of Books");
		return "index";
	}
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public String printBook(ModelMap model) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8001/books";
		ArrayList<Book> books = restTemplate.getForObject(url, ArrayList.class);
//		for(Book book : books){
//			System.out.println("book.getBookTitle() = " + book.getBookTitle());
//		}
		model.addAttribute("booklist", books);
		return "book";
	}

}