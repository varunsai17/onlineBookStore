package com.online.bookstore.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table(name = "books")
@Entity
public class Book {

    @NotNull
    @Id
    Integer book_id;

    @Column(name = "title")
    String title;

    @Column(name = "ISBN")
    String ISBN;

    @Column(name = "publication_year")
    Long publicationYear;

    @Column(name = "genre")
    String genre;

    @Column(name = "price")
    Double Price;




}
