package com.ashim.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashim.dao.SubjectDao;
import com.ashim.model.Subject;

@Repository
public class SubjectDaoImpl implements SubjectDao
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void insertOrUpdate(Subject subject)
	{
		getCurrentSession().saveOrUpdate(subject);
	}

	public void deleteRow(Subject subject)
	{
		getCurrentSession().delete(subject);
	}

	public Subject getRowById(Integer id)
	{
		return (Subject) getCurrentSession().get(Subject.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Subject> getList()
	{
		return getCurrentSession().createQuery("FROM Subject").list();
	}
}