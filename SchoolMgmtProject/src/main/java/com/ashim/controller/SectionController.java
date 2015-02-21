package com.ashim.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashim.model.Grade;
import com.ashim.model.Section;
import com.ashim.service.GradeService;
import com.ashim.service.SectionService;

@Controller
@RequestMapping("/section")
public class SectionController
{
	@Autowired
	private SectionService sectionService;

	@Autowired
	private GradeService gradeService;

	private String mainPage = "section";
	private String toListPage = "/grid";
	private String toAddEditPage = "/crud";
	private String redirectPage = "redirect:/" + mainPage + "/list.html";

	@RequestMapping("/list.html")
	public String showGridPage(Map<String, Object> map)
	{
		map.put("sectionList", sectionService.getList());

		return mainPage + toListPage;
	}

	@RequestMapping(value = "/add.html", method = RequestMethod.GET)
	public String showAddPage(Map<String, Object> map)
	{
		map.put("section", new Section());

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/edit.html", method = RequestMethod.GET)
	public String showEditPage(@ModelAttribute Section section, Map<String, Object> map)
	{
		section = sectionService.getRowById(section.getSectionId());

		map.put("section", section);

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/crud.html", method = RequestMethod.POST)
	public String saveOrUpdateData(@ModelAttribute("section") Section section, BindingResult result)
	{
		if (result.hasErrors())
		{
			System.out.println("Error in alterData() method of SectionController");
		}
		else
		{
			sectionService.insertOrUpdate(section);
		}

		return redirectPage;
	}

	@RequestMapping("/delete.html")
	public String deleteData(@ModelAttribute Section section)
	{
		sectionService.deleteRow(section);

		return redirectPage;
	}

	@ModelAttribute("gradeMap")
	public Map<Integer, Integer> getGradeDropDownList()
	{
		List<Grade> gradeList = gradeService.getList();
		Map<Integer, Integer> gradeMap = new HashMap<Integer, Integer>();

		for (Grade grade : gradeList)
		{
			gradeMap.put(grade.getGradeId(), grade.getGradeName());
		}

		return gradeMap;
	}
}