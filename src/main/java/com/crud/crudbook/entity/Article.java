package com.crud.crudbook.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Article")
@Table(name = "article")
@Data
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private Double price;

    private Integer stock;

    private Long fkCategoryId;

    @ManyToOne
    @JoinColumn(
            name = "fkCategoryId",
            insertable = false,
            updatable = false,
            nullable = false
    )
    private Category category;

}
