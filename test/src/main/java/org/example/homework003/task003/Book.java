package org.example.homework003.task003;

import java.util.Collection;

public class Book {
    String name;
    String author;
    Integer price;
    Integer year;
    Integer countPages;

    public Book(String name, String author, Integer price, Integer year, Integer countPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
        this.countPages = countPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", countPages=" + countPages +
                '}';
    }

}