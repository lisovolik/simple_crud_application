package com.lisovolik.service;

import com.lisovolik.model.Book;

import java.util.List;

/**
 * Created by Alexandr Lisovolik on  01.06.2020
 */

public interface BookService {
    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(int id);

    Book getBookById(int id);

    List<Book> listBooks();
}
