package com.ashim.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashim.dao.GradeDao;
import com.ashim.model.Grade;

@Repository
public class GradeDaoImpl implements GradeDao
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void insertOrUpdate(Grade grade)
	{
		getCurrentSession().saveOrUpdate(grade);
	}

	public void deleteRow(Grade grade)
	{
		getCurrentSession().delete(grade);
	}

	public Grade getRowById(Integer id)
	{
		return (Grade) getCurrentSession().get(Grade.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Grade> getList()
	{
		return getCurrentSession().createQuery("FROM Grade").list();
	}
}