package com.springapp.mvc.model;

/**
 * Created by kim on 8/4/2015.
 */
public class Category {

    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                ", Description: '" + description + '\'' +
                '}';
    }
}
