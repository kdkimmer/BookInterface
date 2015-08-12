package com.springapp.mvc.controller;

import com.springapp.mvc.model.Book;
import com.springapp.mvc.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;

@Controller
public class BookController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Click here for a List of Books");
		model.addAttribute("message2", "Click here for a List of Categories");
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
	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public String printCategories(ModelMap model) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8001/category";
		ArrayList<Category> categories = restTemplate.getForObject(url, ArrayList.class);
		model.addAttribute("category", categories);
		return "category";
	}
	//adding in the form add book this is how we get information off the page
//	@RequestMapping(value = "/", method = RequestMethod.POST)
//	public String addBook(ModelMap model){
//		model.addAttribute("person",new Person());
//
//		return"addbook";
//	}
//	@RequestMapping(value = "/add-book", method = RequestMethod.POST)
//	public String persistBook(@ModelAttribute ("person")Person person){
//
//	}
}