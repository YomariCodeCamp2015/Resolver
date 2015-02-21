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
import org.springframework.web.bind.annotation.RequestParam;

import com.ashim.model.Role;
import com.ashim.model.Staff;
import com.ashim.model.StaffEducation;
import com.ashim.model.StaffWorkExp;
import com.ashim.model.User;
import com.ashim.service.RoleService;
import com.ashim.service.StaffService;

@Controller
@RequestMapping("/staff")
public class StaffController
{
	@Autowired
	private StaffService staffService;

	@Autowired
	private RoleService roleService;

	private String mainPage = "staff";
	private String toListPage = "/grid";
	private String toAddEditPage = "/crud";
	private String redirectPage = "redirect:/" + mainPage + "/list.html";

	@RequestMapping("/list.html")
	public String showGridPage(Map<String, Object> map)
	{
		map.put("staffList", staffService.getList());

		return mainPage + toListPage;
	}

	@RequestMapping(value = "/add.html", method = RequestMethod.GET)
	public String showAddPage(Map<String, Object> map)
	{
		map.put("staff", new Staff());

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/edit.html", method = RequestMethod.GET)
	public String showEditPage(@ModelAttribute Staff staff, Map<String, Object> map)
	{
		staff = staffService.getRowById(staff.getStaffId());

		map.put("staff", staff);

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/crud.html", method = RequestMethod.POST)
	public String saveOrUpdateData(@ModelAttribute("staff") Staff staff, BindingResult result)
	{
		if (result.hasErrors())
		{
			System.out.println("Error in alterData() method of StaffController");
		}
		else
		{
			StaffEducation staffEducation = staff.getStaffEducation();
			staffEducation.setStaffEdu(staff);
			staff.setStaffEducation(staffEducation);

			StaffWorkExp staffWorkExp = staff.getStaffWorkExp();
			staffWorkExp.setStaffWork(staff);
			staff.setStaffWorkExp(staffWorkExp);

			staffService.insertOrUpdate(staff);
		}

		return redirectPage;
	}

	@RequestMapping("/delete.html")
	public String deleteData(@ModelAttribute Staff staff, @RequestParam("userId") Integer userId,
			@RequestParam("staffEduId") Integer staffEduId,
			@RequestParam("staffWorkExpId") Integer staffWorkExpId)
	{
		User user = new User();
		user.setUserId(userId);

		StaffEducation staffEducation = new StaffEducation();
		staffEducation.setStaffEduId(staffEduId);

		StaffWorkExp staffWorkExp = new StaffWorkExp();
		staffWorkExp.setStaffWorkExpId(staffWorkExpId);

		staff.setUserForStaff(user);
		staff.setStaffEducation(staffEducation);
		staff.setStaffWorkExp(staffWorkExp);

		staffService.deleteRow(staff);

		return redirectPage;
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