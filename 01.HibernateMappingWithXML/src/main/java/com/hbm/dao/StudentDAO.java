package com.hbm.dao;

import com.hbm.entity.Student;

public interface StudentDAO {
	
	void saveStudent(Student student);
	Student loadStudent(int stdId);
	Student updateStudent(int stdId, int marks);
	void deleteStudent(int stdId);
}
