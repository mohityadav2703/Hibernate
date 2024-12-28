package com.hbm.entity;

public class Student {

	private Integer stdId;
	private String sname;
	private String gender;
	private Integer marks;
	
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;		
	}
	
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", sname=" + sname + ", gender=" + gender + ", marks=" + marks + "]";
	}	
}
