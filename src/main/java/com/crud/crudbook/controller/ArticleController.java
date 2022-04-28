package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Article;
import com.crud.crudbook.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/article/")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("get/all")
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("get/{id}")
    public Article getById(@PathVariable("id") Long id) {
        return articleService.getArticleById(id);
    }

    @GetMapping("category/{categoryId}")
    public List<Article> getByCategoryId(@PathVariable("categoryId") Long id) {
        return articleService.getArticlesByCategoryId(id);
    }

    @PostMapping("save")
    public Article saveArticle(@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

    @PutMapping("update")
    public Article updateArticle(@RequestBody Article article) {
        return articleService.updateArticle(article);
    }

    @DeleteMapping("delete/{id}")
    public void deleteArticleById(@PathVariable("id") Long id) {
        articleService.deleteArticleById(id);
    }

}
