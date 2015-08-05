package com.springapp.mvc.model;

import java.util.List;

/**
 * Created by kim on 8/4/2015.
 */
public class Book {
    private String bookTitle;
    private int categoryId;
    private String publisher;
    private List<Author> authors;
    private int id;





    public Book(int Id) {
        this.id = Id;
    }

    public Book(int Id, int categoryId, String publisher, String bookTitle) {
        this.id = Id;
        this.categoryId = categoryId;
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

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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

    public int getCategoryId() {
        return categoryId;
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
        bookString.append("Publisher: "+ this.getPublisher()+" -");
        return bookString.toString();
    }
}
