package com.ashim.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashim.model.Parents;
import com.ashim.model.Role;
import com.ashim.model.Section;
import com.ashim.model.Student;
import com.ashim.model.User;
import com.ashim.service.RoleService;
import com.ashim.service.SectionService;
import com.ashim.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController
{
	@Autowired
	private StudentService studentService;

	@Autowired
	private SectionService sectionService;

	@Autowired
	private RoleService roleService;

	private String mainPage = "student";
	private String toListPage = "/grid";
	private String toAddEditPage = "/crud";
	private String redirectPage = "redirect:/" + mainPage + "/list.html";

	@RequestMapping("/list.html")
	public String showGridPage(Map<String, Object> map)
	{
		map.put("studentList", studentService.getList());

		return mainPage + toListPage;
	}

	@RequestMapping(value = "/add.html", method = RequestMethod.GET)
	public String showAddPage(Map<String, Object> map)
	{
		map.put("student", new Student());

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/edit.html", method = RequestMethod.GET)
	public String showEditPage(@ModelAttribute Student student, Map<String, Object> map)
	{
		student = studentService.getRowById(student.getStudentId());

		map.put("student", student);

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/crud.html", method = RequestMethod.POST)
	public String saveOrUpdateData(@ModelAttribute("student") Student student, BindingResult result)
	{
		if (result.hasErrors())
		{
			System.out.println("Error in alterData() method of StudentController");
		}
		else
		{
			Parents parents = student.getParents();
			parents.setStudent(student);
			student.setParents(parents);

			studentService.insertOrUpdate(student);
		}

		return redirectPage;
	}

	@RequestMapping("/delete.html")
	public String deleteData(@ModelAttribute Student student,
			@RequestParam("userId") Integer userId, @RequestParam("parentsId") Integer parentsId)
	{
		User user = new User();
		user.setUserId(userId);
		student.setUserForStudent(user);

		Parents parents = new Parents();
		parents.setParentsId(parentsId);
		student.setParents(parents);

		studentService.deleteRow(student);

		return redirectPage;
	}

	@ModelAttribute("sectionMap")
	public Map<Integer, String> getSectionDropDownList()
	{
		List<Section> sectionList = sectionService.getList();
		Map<Integer, String> sectionMap = new LinkedHashMap<Integer, String>();

		for (Section section : sectionList)
		{
			sectionMap.put(section.getSectionId(), section.getGrade().getGradeName() + " - "
					+ section.getSectionName());
		}

		return sectionMap;
	}

	@ModelAttribute("roleMap")
	public Map<Integer, String> getRoleDropDownList()
	{
		List<Role> roleList = roleService.getList();
		Map<Integer, String> roleMap = new HashMap<Integer, String>();

		for (Role role : roleList)
		{
			roleMap.put(role.getRoleId(), role.getRoleName());
		}

		return roleMap;
	}
}