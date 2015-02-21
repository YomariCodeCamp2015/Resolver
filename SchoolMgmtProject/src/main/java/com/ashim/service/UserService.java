package com.ashim.service;

import com.ashim.base.DaoModel;
import com.ashim.model.User;

public interface UserService extends DaoModel<User>
{
	public User verifyUser(User user);
}