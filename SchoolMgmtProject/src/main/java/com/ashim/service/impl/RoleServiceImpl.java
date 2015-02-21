package com.ashim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashim.dao.RoleDao;
import com.ashim.model.Role;
import com.ashim.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService
{
	@Autowired
	private RoleDao roleDao;

	public void insertOrUpdate(Role role)
	{
		roleDao.insertOrUpdate(role);
	}

	public void deleteRow(Role role)
	{
		roleDao.deleteRow(role);
	}

	public Role getRowById(Integer id)
	{
		return roleDao.getRowById(id);
	}

	public List<Role> getList()
	{
		return roleDao.getList();
	}
}