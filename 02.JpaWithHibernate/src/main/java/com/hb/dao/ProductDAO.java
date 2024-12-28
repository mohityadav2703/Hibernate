package com.hb.dao;

import com.hb.entity.ProductEntity;

public interface ProductDAO {
	
	ProductEntity saveProduct(ProductEntity product);
	ProductEntity LoadProductById(Integer productId);
	ProductEntity updateProductById(Integer productId, Double new_Unit_Price);
	void deleteProductById(Integer productId);
}
