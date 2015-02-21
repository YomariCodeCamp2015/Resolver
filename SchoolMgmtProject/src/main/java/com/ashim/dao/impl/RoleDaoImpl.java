package com.ashim.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashim.dao.RoleDao;
import com.ashim.model.Role;

@Repository
public class RoleDaoImpl implements RoleDao
{
	@Autowired
	private SessionFactory sessionFactory;

	public Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void insertOrUpdate(Role role)
	{
		getCurrentSession().saveOrUpdate(role);
	}

	public void deleteRow(Role role)
	{
		getCurrentSession().delete(role);
	}

	public Role getRowById(Integer id)
	{
		return (Role) getCurrentSession().get(Role.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Role> getList()
	{
		return getCurrentSession().createQuery("FROM Role").list();
	}
}