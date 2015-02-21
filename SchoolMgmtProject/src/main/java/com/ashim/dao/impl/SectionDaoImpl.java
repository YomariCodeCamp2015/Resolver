package com.ashim.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashim.dao.SectionDao;
import com.ashim.model.Section;

@Repository
public class SectionDaoImpl implements SectionDao
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void insertOrUpdate(Section section)
	{
		getCurrentSession().saveOrUpdate(section);
	}

	public void deleteRow(Section section)
	{
		getCurrentSession().delete(section);
	}

	public Section getRowById(Integer id)
	{
		return (Section) getCurrentSession().get(Section.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Section> getList()
	{
		return getCurrentSession().createQuery("FROM Section").list();
	}
}