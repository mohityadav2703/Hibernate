package com.hb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class EmployeeEntity {

	@Id
	@Column(name="empno")
	private Integer empNumber;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="sal")
	private Integer salary;
	
	@Column(name="deptno")
	private Integer deptNumber;

	public Integer getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(Integer deptNumber) {
		this.deptNumber = deptNumber;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empNumber=" + empNumber + ", empName=" + empName + ", salary=" + salary
				+ ", deptNumber=" + deptNumber + "]";
	}
	
}
