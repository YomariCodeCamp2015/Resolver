package com.ashim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ashim.dao.SectionDao;
import com.ashim.model.Section;
import com.ashim.service.SectionService;

@Service
@Transactional
public class SectionServiceImpl implements SectionService
{
	@Autowired
	private SectionDao sectionDao;

	public void insertOrUpdate(Section section)
	{
		sectionDao.insertOrUpdate(section);
	}

	public void deleteRow(Section section)
	{
		sectionDao.deleteRow(section);
	}

	public Section getRowById(Integer id)
	{
		return sectionDao.getRowById(id);
	}

	public List<Section> getList()
	{
		return sectionDao.getList();
	}
}