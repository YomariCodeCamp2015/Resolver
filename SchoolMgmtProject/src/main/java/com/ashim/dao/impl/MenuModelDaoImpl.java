package com.ashim.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashim.dao.MenuModelDao;
import com.ashim.model.MenuModel;

@Repository
public class MenuModelDaoImpl implements MenuModelDao
{
	@Autowired
	private SessionFactory sessionFactory;

	public Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void insertOrUpdate(MenuModel menuModel)
	{
	}

	public void deleteRow(MenuModel menuModel)
	{
	}

	public MenuModel getRowById(Integer id)
	{
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<MenuModel> getList()
	{
		return getCurrentSession().createQuery("FROM MenuModel").list();
	}
}