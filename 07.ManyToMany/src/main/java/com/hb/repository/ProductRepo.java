package com.hb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hb.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String> {

}
