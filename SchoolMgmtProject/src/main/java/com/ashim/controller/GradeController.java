package com.ashim.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashim.model.Grade;
import com.ashim.service.GradeService;

@Controller
@RequestMapping("/grade")
public class GradeController
{
	@Autowired
	private GradeService gradeService;

	private String mainPage = "grade";
	private String toListPage = "/grid";
	private String toAddEditPage = "/crud";
	private String redirectPage = "redirect:/" + mainPage + "/list.html";

	@RequestMapping("/list.html")
	public String showGridPage(Map<String, Object> map)
	{
		map.put("gradeList", gradeService.getList());

		return mainPage + toListPage;
	}

	@RequestMapping(value = "/add.html", method = RequestMethod.GET)
	public String showAddPage(Map<String, Object> map)
	{
		map.put("grade", new Grade());

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/edit.html", method = RequestMethod.GET)
	public String showEditPage(@ModelAttribute Grade grade, Map<String, Object> map)
	{
		grade = gradeService.getRowById(grade.getGradeId());

		map.put("grade", grade);

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/crud.html", method = RequestMethod.POST)
	public String saveOrUpdateData(@ModelAttribute("grade") Grade grade, BindingResult result)
	{
		if (result.hasErrors())
		{
			System.out.println("Error in alterData() method of GradeController");
		}
		else
		{
			gradeService.insertOrUpdate(grade);
		}

		return redirectPage;
	}

	@RequestMapping("/delete.html")
	public String deleteData(@ModelAttribute Grade grade)
	{
		gradeService.deleteRow(grade);

		return redirectPage;
	}
}