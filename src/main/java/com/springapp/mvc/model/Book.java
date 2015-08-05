package com.springapp.mvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kim on 8/4/2015.
 */
public class Book {
    private String bookTitle;
    private String categoryDescription;
    private String publisher;
    private List<Author> authors;
    private int id;
    private ArrayList<Category> categories = new ArrayList<Category>();


    public Book(int Id) {
        this.id = Id;
    }

    public Book(int Id, String categoryDescription, String publisher, String bookTitle) {
        this.id = Id;
        this.categoryDescription = categoryDescription;
        this.publisher = publisher;
        this.bookTitle = bookTitle;

    }
    public Book(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public Book() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getId() {
        return id;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString(){
        StringBuilder bookString = new StringBuilder();
        bookString.append("ID: "+ this.getId()+" -");
        bookString.append("Title: "+ this.getBookTitle()+" -");
        bookString.append("Description: "+this.getCategoryDescription()+ " -");
        bookString.append("Publisher: "+ this.getPublisher()+" -");
        return bookString.toString();
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}
