package com.online.bookstore.service;

import com.online.bookstore.models.Book;
import com.online.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    BookRepository bookRepo;

    public UserService(){

    }

    public void addBook(Book book){
        bookRepo.save(book);
    }

}
