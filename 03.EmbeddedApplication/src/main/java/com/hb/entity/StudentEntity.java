package com.hb.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_student")
public class StudentEntity {
	
	@EmbeddedId
	private StudentCompositeKey composite;
	
	private String name;
	private Integer marks;
	public StudentCompositeKey getComposite() {
		return composite;
	}
	public void setComposite(StudentCompositeKey composite) {
		this.composite = composite;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	

}
