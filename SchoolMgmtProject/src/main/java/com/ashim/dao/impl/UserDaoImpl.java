package com.ashim.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashim.dao.UserDao;
import com.ashim.model.User;

@Repository
public class UserDaoImpl implements UserDao
{
	@Autowired
	private SessionFactory sessionFactory;

	public Session getCurrentSession()
	{
		return this.sessionFactory.getCurrentSession();
	}

	public void insertOrUpdate(User user)
	{
		getCurrentSession().saveOrUpdate(user);
	}

	public void deleteRow(User user)
	{
		getCurrentSession().delete(user);
	}

	public User getRowById(Integer id)
	{
		return (User) getCurrentSession().get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<User> getList()
	{
		return getCurrentSession().createQuery("from User").list();
	}

	public User verifyUser(User user)
	{
		String hql = "from User where userName = :userName and userPass = :userPass";

		User u = (User) getCurrentSession().createQuery(hql)
				.setParameter("userName", user.getUserName())
				.setParameter("userPass", user.getUserPass()).uniqueResult();

		if (u == null)
		{
			return null;
		}

		return u;
	}
}