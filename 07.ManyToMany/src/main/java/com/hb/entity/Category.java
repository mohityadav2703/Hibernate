package com.hb.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_category")
public class Category {

	@Id
	private String cId;
	
	private String title;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Product> product = new ArrayList<>();

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String cId, String title, List<Product> product) {
		super();
		this.cId = cId;
		this.title = title;
		this.product = product;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
