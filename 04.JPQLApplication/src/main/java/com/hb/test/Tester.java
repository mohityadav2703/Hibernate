package com.hb.test;

import java.util.List;

import com.hb.DAO.EmployeeDAO;
import com.hb.DAO.impl.EmployeeDAOImpl;
import com.hb.entity.EmployeeEntity;

public class Tester {
	public static void main(String[] args) {
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		
//		EmployeeEntity emp=dao.fetchEmployeeById(7698);
//		System.out.println(emp);
//		
//		List<EmployeeEntity> e=dao.fetchEmployee();
//		System.out.println(e);
		
		List<Object[]> em =dao.fetchNamesAndSalaries();
		em.forEach(obj-> {System.out.println(obj[0]+" "+obj[1]);});
		
	}
}
