package com.hb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hb.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {

	private EntityManagerFactory factory;

	public ProductDAOImpl() {
		factory=Persistence.createEntityManagerFactory("test");
	}
	
	@Override
	public ProductEntity saveProduct(ProductEntity product) {
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(product);
			tx.commit();
			System.out.println("Product is inserted to the database.....");
		}
		catch(Exception e) {
			tx.rollback();
			System.out.println("Product is not inserted...."+e);
		}
		finally {
			entityManager.close();
		}
		return product;
	}

	@Override
	public ProductEntity LoadProductById(Integer productId) {
		EntityManager entityManager=factory.createEntityManager();
		/* 
		 * find() :early load
		 * getReference() : lazy load
		*/
		ProductEntity prod=entityManager.find(ProductEntity.class, productId);
		entityManager.close();
		return prod;
	}

	@Override
	public ProductEntity updateProductById(Integer productId, Double new_Unit_Price) {
		EntityManager entityManager=factory.createEntityManager();
		ProductEntity prod=entityManager.find(ProductEntity.class, productId);
		EntityTransaction tx =entityManager.getTransaction();
		tx.begin();
		prod.setUnitPrice(new_Unit_Price);
		tx.commit();
		entityManager.close();
		return prod;
	}

	@Override
	public void deleteProductById(Integer productId) {
		EntityManager entityManager=factory.createEntityManager();
		ProductEntity prod=entityManager.find(ProductEntity.class, productId);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.remove(prod);
		tx.commit();
		entityManager.close();
	}

}
