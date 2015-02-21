package com.ashim.service;

import java.util.List;

import com.ashim.base.DaoModel;
import com.ashim.model.Student;

public interface StudentService extends DaoModel<Student>
{
	public List<Student> getDataByStudent(Student student);
}