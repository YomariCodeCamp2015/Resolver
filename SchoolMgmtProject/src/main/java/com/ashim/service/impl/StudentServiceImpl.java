package com.ashim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashim.dao.StudentDao;
import com.ashim.model.Student;
import com.ashim.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentDao studentDao;

	public void insertOrUpdate(Student student)
	{
		studentDao.insertOrUpdate(student);
	}

	public void deleteRow(Student student)
	{
		studentDao.deleteRow(student);
	}

	public Student getRowById(Integer id)
	{
		return studentDao.getRowById(id);
	}

	public List<Student> getList()
	{
		return studentDao.getList();
	}

	public List<Student> getDataByStudent(Student student)
	{
		return studentDao.getDataByStudent(student);
	}
}