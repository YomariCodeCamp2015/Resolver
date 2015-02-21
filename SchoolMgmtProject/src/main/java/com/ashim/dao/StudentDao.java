package com.ashim.dao;

import java.util.List;

import com.ashim.base.DaoModel;
import com.ashim.model.Student;

public interface StudentDao extends DaoModel<Student>
{
	public List<Student> getDataByStudent(Student student);
}