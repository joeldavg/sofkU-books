package com.crud.crudbook.service;

import com.crud.crudbook.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();

    Category getCategoryById(Long id);

    Category saveCategory(Category category);

    Category updateCategory(Category category);

    void deleteCategoryById(Long id);

}
