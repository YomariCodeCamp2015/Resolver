package com.ashim.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashim.common.MenuInfoEditor;
import com.ashim.model.MenuInfo;
import com.ashim.model.MenuModel;
import com.ashim.model.Role;
import com.ashim.service.MenuModelService;
import com.ashim.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController
{
	@Autowired
	private RoleService roleService;

	@Autowired
	private MenuModelService menuModelService;

	private String mainPage = "role";
	private String toListPage = "/grid";
	private String toAddEditPage = "/crud";
	private String redirectPage = "redirect:/" + mainPage + "/list.html";

	@InitBinder
	public void initBinder(WebDataBinder binder) throws Exception
	{
		binder.registerCustomEditor(MenuInfo.class, new MenuInfoEditor());
	}

	@RequestMapping("/list.html")
	public String showGridPage(Map<String, Object> map)
	{
		map.put("roleList", roleService.getList());

		return mainPage + toListPage;
	}

	@RequestMapping(value = "/add.html", method = RequestMethod.GET)
	public String showAddPage(Map<String, Object> map)
	{
		map.put("role", new Role());

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/edit.html", method = RequestMethod.GET)
	public String showEditPage(@ModelAttribute Role role, Map<String, Object> map)
	{
		role = roleService.getRowById(role.getRoleId());

		map.put("role", role);

		return mainPage + toAddEditPage;
	}

	@RequestMapping(value = "/crud.html", method = RequestMethod.POST)
	public String saveOrUpdateData(@ModelAttribute("role") Role role, BindingResult result)
	{
		if (result.hasErrors())
		{
			System.out.println("Error in alterData() method of RoleController");
		}
		else
		{
			roleService.insertOrUpdate(role);
		}

		return redirectPage;
	}

	@RequestMapping("/delete.html")
	public String deleteData(@ModelAttribute Role role)
	{
		roleService.deleteRow(role);

		return redirectPage;
	}

	@ModelAttribute("menuModelList")
	public List<MenuModel> getMenuModelList()
	{
		List<MenuModel> menuModelList = menuModelService.getList();

		return menuModelList;
	}
}