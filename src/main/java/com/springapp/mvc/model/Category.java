package com.springapp.mvc.model;

/**
 * Created by kim on 8/4/2015.
 */
public class Category {
    private int id;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "ID: " + id +
                ", Description: '" + description + '\'' +
                '}';
    }
}
