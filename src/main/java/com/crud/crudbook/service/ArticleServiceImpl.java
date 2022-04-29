package com.crud.crudbook.service;

import com.crud.crudbook.entity.Article;
import com.crud.crudbook.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Article getArticleById(Long id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public List<Article> getArticlesByCategoryId(Long categoryId) {
        return articleRepository.findByFkCategoryId(categoryId);
    }

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article updateArticle(Article article) {
        Optional<Article> articleToBeUpdated = articleRepository.findById(article.getId());
        if (articleToBeUpdated.isEmpty()) {
            throw new IllegalStateException("Article with id: " + article.getId() + " was not found");
        }
        return articleRepository.save(article);
    }

    @Override
    public void deleteArticleById(Long id) {
        articleRepository.deleteById(id);
    }
}
