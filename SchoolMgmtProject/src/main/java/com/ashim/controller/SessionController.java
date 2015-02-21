package com.ashim.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;

import com.ashim.model.MenuInfo;
import com.ashim.model.MenuModel;
import com.ashim.model.User;
import com.ashim.service.MenuModelService;
import com.ashim.service.UserService;

@Controller
@SessionAttributes({ "userSession", "menuModelSession" })
public class SessionController {
	@Autowired
	private UserService userService;

	@Autowired
	private MenuModelService menuModelService;

	String returnPage = "";

	@RequestMapping(value = "/verifyLogin.html", method = RequestMethod.POST)
	public String verifyLogin(@ModelAttribute("user") User user,
			BindingResult result, Map<String, Object> map, HttpSession session) {

		returnPage = "redirect:/first.html";

		if (result.hasErrors()) {
			System.out
			.println("Error in verifyLogin() method of UserController");
		} else {
			user = userService.verifyUser(user);

			if (user == null) {
				map.put("errMsg", "invalid");

				returnPage = "redirect:/login.html";
			} else {
				// Create session
				map.put("userSession", user);
				map.put("menuModelSession", createMenuModelSession(user));
			}
		}

		return returnPage;
	}

	@RequestMapping(value = "/verfiyLockscreen.html", method = RequestMethod.POST)
	public String verifyLockScreen(@ModelAttribute("user") User user,
			BindingResult result, Map<String, Object> map, WebRequest request) {
		returnPage = "redirect:/first.html";

		if (result.hasErrors()) {
			System.out
			.println("Error in verifyLockScreen() method of UserController");
		} else {
			user = userService.verifyUser(user);

			if (user == null) {
				map.put("errMsg", "invalid");

				returnPage = "redirect:/lockScreen.html";
			} else {
				// Create session
				map.put("userSession", user);
				map.put("menuModelSession", createMenuModelSession(user));

				// Clean session
				request.removeAttribute("lockScreenSession",
						WebRequest.SCOPE_SESSION);
			}
		}

		return returnPage;
	}

	private List<MenuModel> createMenuModelSession(User user) {
		List<MenuInfo> menuInfoList = user.getRole().getMenuInfoList();
		List<MenuModel> menuModelList = menuModelService.getList();
		List<MenuModel> menuModelSession = new ArrayList<MenuModel>();

		for (MenuModel mm : menuModelList) {
			MenuModel menuModel = null;

			for (MenuInfo mi : menuInfoList) {
				if (menuModel == null) {
					if (mm.getMenuModelId().equals(
							mi.getMenuModel().getMenuModelId())) {
						menuModel = mi.getMenuModel();
						menuModel.setMenuInfoList(new ArrayList<MenuInfo>());

						MenuInfo menuInfo = new MenuInfo();
						menuInfo.setMenuInfoId(mi.getMenuInfoId());
						menuInfo.setMenuInfoName(mi.getMenuInfoName());
						menuInfo.setMenuInfoUrl(mi.getMenuInfoUrl());

						menuModel.getMenuInfoList().add(menuInfo);
					}
				} else if (menuModel.getMenuModelId().equals(
						mi.getMenuModel().getMenuModelId())) {
					MenuInfo menuInfo = new MenuInfo();
					menuInfo.setMenuInfoId(mi.getMenuInfoId());
					menuInfo.setMenuInfoName(mi.getMenuInfoName());
					menuInfo.setMenuInfoUrl(mi.getMenuInfoUrl());

					menuModel.getMenuInfoList().add(menuInfo);
				}
			}

			if (menuModel != null) {
				menuModelSession.add(menuModel);
			}
		}

		return menuModelSession;
	}
}