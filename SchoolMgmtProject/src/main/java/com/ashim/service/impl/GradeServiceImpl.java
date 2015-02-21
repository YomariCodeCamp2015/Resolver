package com.ashim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashim.dao.GradeDao;
import com.ashim.model.Grade;
import com.ashim.service.GradeService;

@Service
@Transactional
public class GradeServiceImpl implements GradeService
{
	@Autowired
	private GradeDao gradeDao;

	public void insertOrUpdate(Grade grade)
	{
		gradeDao.insertOrUpdate(grade);
	}

	public void deleteRow(Grade grade)
	{
		gradeDao.deleteRow(grade);
	}

	public Grade getRowById(Integer id)
	{
		return gradeDao.getRowById(id);
	}

	public List<Grade> getList()
	{
		return gradeDao.getList();
	}
}