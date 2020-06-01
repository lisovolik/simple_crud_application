package com.lisovolik.dao;

import com.lisovolik.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexandr Lisovolik on  01.06.2020
 */


public class BookDaoImpl implements BookDao {

    private static final Logger logger = LoggerFactory.getLogger(BookDaoImpl.class);

    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }



    public void addBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(book);
        logger.info("Book successfully saved. Book detail " + book);
    }


    public void updateBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.update(book);
        logger.info("Book successfully updated. Book detail " + book);
    }


    public void removeBook(int id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = (Book) session.load(Book.class, id);
        if (book != null){
            session.delete(book);
            logger.info("Book successfully deleted. Book detail " + book);
        }

    }


    public Book getBookById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Book book =  (Book) session.load(Book.class, id);
        logger.info("Book successfully loaded. Book detail " + book);
        return book;
    }


    @SuppressWarnings("unchecked")
    public List<Book> listBooks() {
        Session session = sessionFactory.getCurrentSession();
        List<Book> list =  session.createQuery("from Book").list();


        logger.info("Books are loaded. Count =  " + list.size());
        return list;
    }
}
