package com.lisovolik.dao;

import com.lisovolik.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Alexandr Lisovolik on  01.06.2020
 */

@Repository
public interface BookDao {
    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(int id);

    Book getBookById(int id);

    List<Book> listBooks();
}
