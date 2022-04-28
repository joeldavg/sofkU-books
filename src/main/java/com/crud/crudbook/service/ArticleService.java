package com.crud.crudbook.service;

import com.crud.crudbook.entity.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticles();

    Article getArticleById(Long id);

    List<Article> getArticlesByCategoryId(Long categoryId);

    Article saveArticle(Article article);

    Article updateArticle(Article article);

    void deleteArticleById(Long id);

}
