package com.ashim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashim.dao.MenuModelDao;
import com.ashim.model.MenuModel;
import com.ashim.service.MenuModelService;

@Service
@Transactional
public class MenuModelServiceImpl implements MenuModelService
{
	@Autowired
	private MenuModelDao menuModelDao;

	public void insertOrUpdate(MenuModel menuModel)
	{
	}

	public void deleteRow(MenuModel menuModel)
	{
	}

	public MenuModel getRowById(Integer id)
	{
		return menuModelDao.getRowById(id);
	}

	public List<MenuModel> getList()
	{
		return menuModelDao.getList();
	}
}