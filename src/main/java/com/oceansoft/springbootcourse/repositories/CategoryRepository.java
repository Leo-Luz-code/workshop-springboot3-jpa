package com.oceansoft.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oceansoft.springbootcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}