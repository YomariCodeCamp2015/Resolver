package com.ashim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashim.dao.UserDao;
import com.ashim.model.User;
import com.ashim.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDao userDao;

	public void insertOrUpdate(User user)
	{
		userDao.insertOrUpdate(user);
	}

	public void deleteRow(User user)
	{
		userDao.deleteRow(user);
	}

	public User getRowById(Integer id)
	{
		return userDao.getRowById(id);
	}

	public List<User> getList()
	{
		return userDao.getList();
	}

	public User verifyUser(User user)
	{
		return userDao.verifyUser(user);
	}
}