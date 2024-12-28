package com.hb.client;

import com.hb.dao.ProductDAO;
import com.hb.dao.ProductDAOImpl;
import com.hb.entity.ProductEntity;

public class Tester {
	public static void main(String[] args) {
		
		ProductDAO dao = new ProductDAOImpl();
		/*
		 * create a new product entity
		*/
		ProductEntity pEntity=new ProductEntity();
		pEntity.setProductId(129011);
		pEntity.setProductName("Laptop");
		pEntity.setQuantity(12);
		pEntity.setUnitPrice(38000.00);
	
		// call saveProduct() of DAO class
		dao.saveProduct(pEntity);
		
	
		/* call updateProductById() of DAO class*/
		
//		
//		  ProductEntity p = dao.updateProductById(129011, 56000.0);
//		  System.out.println(p); 
		
		
	}
}
