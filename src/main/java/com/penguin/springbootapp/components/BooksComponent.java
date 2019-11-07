package com.penguin.springbootapp.components;

import com.penguin.springbootapp.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class BooksComponent {
    private List<Book> books;

    public List<Book> getValidBooks () {
        checkMissiningValues(books);
        checkSecurityValues(books);
        checkBrokenLinks(books);
        return books;
    }
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    private void checkMissiningValues(List<Book> books) {
        for (Book book : books) {
            if (book.isEmptyValues()){
                System.out.println(book.getTitle() + " has missing values");
            }
        }
    }

    private void checkSecurityValues(List<Book> books) {
        for (Book book : books) {
            if (!book.isSecureValue()){
                System.out.println(book.getTitle() + " has insecure values");
            }
        }
    }

    private void checkBrokenLinks(List<Book> books) {
        for (Book book : books) {
            if (!book.isUrlValid()){
                System.out.println(book.getTitle() + " has invalid url");
            }
        }
    }
}
