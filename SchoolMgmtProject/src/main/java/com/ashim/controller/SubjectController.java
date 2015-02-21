package com.ashim.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashim.model.Grade;
import com.ashim.model.Staff;
import com.ashim.model.Subject;
import com.ashim.service.GradeService;
import com.ashim.service.StaffService;
import com.ashim.service.SubjectService;

@Controller
@RequestMapping("/subject")
public class SubjectController
{
	@Autowired
	private SubjectService subjectService;

	@Autowired
	private GradeService gradeService;

	@Autowired
	private StaffService staffService;

	private String mainPage = "subject";
	private String toListPage = "/grid";
	private String toAddEditPage = "/crud";
	private String redirectPage = "redirect:/" + mainPage + "/list.html";

	@RequestMapping("/list.html")
	public String showGridPage(Map<String, Object> map)
	{
		map.put("subjectList", subjectService.getList());

		return mainPage + toListPage;
	}

	@RequestMapping(value = "/add.html", method = RequestMethod.GET)
	public String showAddPage(Map<String, Object> map)
	{
		map.put("subject", new Subject());

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/edit.html", method = RequestMethod.GET)
	public String showEditPage(@ModelAttribute Subject subject, Map<String, Object> map)
	{
		subject = subjectService.getRowById(subject.getSubjectId());

		map.put("subject", subject);

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/crud.html", method = RequestMethod.POST)
	public String saveOrUpdateData(@ModelAttribute("subject") Subject subject, BindingResult result)
	{
		if (result.hasErrors())
		{
			System.out.println("Error in alterData() method of SubjectController");
		}
		else
		{
			subjectService.insertOrUpdate(subject);
		}

		return redirectPage;
	}

	@RequestMapping("/delete.html")
	public String deleteData(@ModelAttribute Subject subject)
	{
		subjectService.deleteRow(subject);

		return redirectPage;
	}

	@ModelAttribute("gradeMap")
	public Map<Integer, Integer> getGradeDropDownList()
	{
		List<Grade> gradeList = gradeService.getList();
		Map<Integer, Integer> gradeMap = new LinkedHashMap<Integer, Integer>();

		for (Grade grade : gradeList)
		{
			gradeMap.put(grade.getGradeId(), grade.getGradeName());
		}

		return gradeMap;
	}

	@ModelAttribute("staffMap")
	public Map<Integer, String> getStaffDropDownList()
	{
		List<Staff> staffList = staffService.getList();
		Map<Integer, String> staffMap = new LinkedHashMap<Integer, String>();

		for (Staff staff : staffList)
		{
			if (staff.getStaffType().equals("Teacher") && staff.getStaffStatus().equals("Yes"))
			{
				staffMap.put(staff.getStaffId(), staff.getStaffName());
			}
		}

		return staffMap;
	}
}