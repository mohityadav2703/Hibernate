package com.hb.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StudentCompositeKey implements Serializable{
	
	private Integer rollNo;
	private String section;
	
	
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	

}
