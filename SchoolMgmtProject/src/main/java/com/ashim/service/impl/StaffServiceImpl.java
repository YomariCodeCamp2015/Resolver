package com.ashim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashim.dao.StaffDao;
import com.ashim.model.Staff;
import com.ashim.service.StaffService;

@Service
@Transactional
public class StaffServiceImpl implements StaffService
{
	@Autowired
	private StaffDao staffDao;

	public void insertOrUpdate(Staff staff)
	{
		staffDao.insertOrUpdate(staff);
	}

	public void deleteRow(Staff staff)
	{
		staffDao.deleteRow(staff);
	}

	public Staff getRowById(Integer id)
	{
		return staffDao.getRowById(id);
	}

	public List<Staff> getList()
	{
		return staffDao.getList();
	}
}