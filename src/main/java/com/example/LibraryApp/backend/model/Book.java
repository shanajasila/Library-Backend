package com.example.LibraryApp.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue
    private int id;
    private String booktitle;
    private String author;
    private String description;
    private String image;

    public Book() {
    }

    public Book(int id, String booktitle, String author, String description, String image) {
        this.id = id;
        this.booktitle = booktitle;
        this.author = author;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
