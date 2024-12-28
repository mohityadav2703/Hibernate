package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_laptop")
public class Laptop {

	@Id
	private Integer laptopId;
	private String modelNumber;
	private String brand;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(Integer laptopId, String modelNumber, String brand, Student student) {
		super();
		this.laptopId = laptopId;
		this.modelNumber = modelNumber;
		this.brand = brand;
		this.student = student;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Integer getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(Integer laptopId) {
		this.laptopId = laptopId;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
