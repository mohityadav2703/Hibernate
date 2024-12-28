package com.hb.DAO.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.hb.DAO.EmployeeDAO;
import com.hb.constants.AppConstants;
import com.hb.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	
	@Override		//GETTING SINGLE EMPLOYEE DATA
	public EmployeeEntity fetchEmployeeById(Integer empno) {
		EntityManager entityManager =factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq=entityManager.createQuery(AppConstants.QUERY1, EmployeeEntity.class);
		tq.setParameter(1, empno);
		EmployeeEntity e = tq.getSingleResult();
		entityManager.clear();
		return e;
	}

	@Override		//GETTING ALL EMPLOYEE DATA
	public List<EmployeeEntity> fetchEmployee() {
		EntityManager entityManager =factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq=entityManager.createQuery(AppConstants.QUERY2, EmployeeEntity.class);
		List<EmployeeEntity> listOfEmployee=tq.getResultList();
		entityManager.close();
		return listOfEmployee;
	}

	@Override		//GETTING PARTIAL DATA(EMPLOYEE NAME AND SALARY)
	public List<Object[]> fetchNamesAndSalaries() {
		EntityManager entityManager =factory.createEntityManager();
		TypedQuery<Object[]> tq=entityManager.createQuery(AppConstants.QUERY3, Object[].class);
		List<Object[]> lst=tq.getResultList();
		entityManager.close();
		return lst;
	}

}
