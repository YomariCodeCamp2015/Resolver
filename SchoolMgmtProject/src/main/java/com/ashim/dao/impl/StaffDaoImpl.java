package com.ashim.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashim.dao.StaffDao;
import com.ashim.model.Staff;

@Repository
public class StaffDaoImpl implements StaffDao
{
	@Autowired
	private SessionFactory sessionFactory;

	public Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void insertOrUpdate(Staff staff)
	{
		getCurrentSession().saveOrUpdate(staff);
	}

	public void deleteRow(Staff staff)
	{
		getCurrentSession().delete(staff);
	}

	public Staff getRowById(Integer id)
	{
		return (Staff) getCurrentSession().get(Staff.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Staff> getList()
	{
		return getCurrentSession().createQuery("FROM Staff").list();
	}
}