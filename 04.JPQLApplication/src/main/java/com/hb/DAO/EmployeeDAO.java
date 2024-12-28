package com.hb.DAO;

import java.util.List;

import com.hb.entity.EmployeeEntity;

public interface EmployeeDAO {
	
	EmployeeEntity fetchEmployeeById(Integer empno);
	List<EmployeeEntity> fetchEmployee();
	List<Object[]> fetchNamesAndSalaries();

}
