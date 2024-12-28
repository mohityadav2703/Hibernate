package com.hb.DAO;

import com.hb.entity.StudentCompositeKey;
import com.hb.entity.StudentEntity;

public interface StudentDAO {

	void saveStudent(StudentEntity entity);
	StudentEntity fetchStudent(StudentCompositeKey compositeKey);
}
