package com.hb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hb.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, String> {

}
