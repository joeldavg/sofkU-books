package com.crud.crudbook.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Book")
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String author;

    private Integer numberPages;

}
