package com.ashim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashim.dao.SubjectDao;
import com.ashim.model.Subject;
import com.ashim.service.SubjectService;

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService
{
	@Autowired
	private SubjectDao subjectDao;

	public void insertOrUpdate(Subject subject)
	{
		subjectDao.insertOrUpdate(subject);
	}

	public void deleteRow(Subject subject)
	{
		subjectDao.deleteRow(subject);
	}

	public Subject getRowById(Integer id)
	{
		return subjectDao.getRowById(id);
	}

	public List<Subject> getList()
	{
		return subjectDao.getList();
	}
}