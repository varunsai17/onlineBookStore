package com.online.bookstore.controller;

import com.online.bookstore.models.Book;
import com.online.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class BookController {

    @Autowired
    UserService userService;

    @GetMapping ("/books")
    public String addUser(){
        Book book = new Book();

        book.setBook_id(2);
        book.setGenre("comedy");
        book.setISBN("1278");
        book.setPrice(128.92);
        book.setPublicationYear((long)1999);
        book.setTitle("laugh...");

        userService.addBook(book);

        return new String("Thank you!!");

    }
}
