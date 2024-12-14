package com.oceansoft.springbootcourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oceansoft.springbootcourse.entities.Category;
import com.oceansoft.springbootcourse.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {

        Optional<Category> user = categoryRepository.findById(id);

        return user.get();

    }
}