package com.hb.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hb.entity.Category;
import com.hb.entity.Product;
import com.hb.repository.CategoryRepo;
import com.hb.repository.ProductRepo;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private ProductRepo pRepo;
	
	@Autowired
	private CategoryRepo cRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Product prod1 = new Product();
		prod1.setpId("pid-1");
		prod1.setProductName("Iphone 14 max pro");
		
		Product prod2 = new Product();
		prod2.setpId("pid-2");
		prod2.setProductName("Samsung s22 ultra");
		
		Product prod3 = new Product();
		prod3.setpId("prod-3");
		prod3.setProductName("Samsung TV12341");
		
		
		Category categ1 = new Category();
		categ1.setcId("cid-1");
		categ1.setTitle("Electronics");
		
		Category categ2 = new Category();
		categ2.setcId("cid-2");
		categ2.setTitle("Mobile Phone");
		
		List<Product> category1Product = categ1.getProduct();
		category1Product.add(prod1);
		category1Product.add(prod2);
		category1Product.add(prod3);
		
		List<Product> category2Product = categ2.getProduct();
		category2Product.add(prod1);
		category2Product.add(prod2);
		category2Product.add(prod3);
		
		cRepo.save(categ1);
		cRepo.save(categ2);
	
		
		
	}
	
}
