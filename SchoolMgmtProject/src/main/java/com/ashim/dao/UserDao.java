package com.ashim.dao;

import com.ashim.base.DaoModel;
import com.ashim.model.User;

public interface UserDao extends DaoModel<User>
{
	public User verifyUser(User user);
}