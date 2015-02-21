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

import com.ashim.model.Role;
import com.ashim.model.User;
import com.ashim.service.RoleService;
import com.ashim.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	private String mainPage = "user";
	private String toListPage = "/grid";
	private String toAddEditPage = "/crud";
	private String redirectPage = "redirect:/" + mainPage + "/list.html";

	@RequestMapping("/list.html")
	public String showGridPage(Map<String, Object> map) {

		map.put("userList", userService.getList());

		return mainPage + toListPage;

	}

	@RequestMapping(value = "/add.html", method = RequestMethod.GET)
	public String showAddPage(Map<String, Object> map) {
		map.put("user", new User());

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/edit.html", method = RequestMethod.GET)
	public String showEditPage(@ModelAttribute User user,
			Map<String, Object> map) {
		user = userService.getRowById(user.getUserId());

		map.put("user", user);

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/crud.html", method = RequestMethod.POST)
	public String saveOrUpdateData(@ModelAttribute("user") User user,
			BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Error in alterData() method of UserController");
		} else {
			userService.insertOrUpdate(user);
		}

		return redirectPage;
	}

	@RequestMapping("/delete.html")
	public String deleteData(@ModelAttribute User user) {
		userService.deleteRow(user);

		return redirectPage;
	}

	@ModelAttribute("roleMap")
	public Map<Integer, String> getRoleDropDownList() {
		List<Role> roleList = roleService.getList();
		Map<Integer, String> roleMap = new HashMap<Integer, String>();

		for (Role role : roleList) {
			roleMap.put(role.getRoleId(), role.getRoleName());
		}

		return roleMap;
	}
}