package com.ashim.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import com.ashim.model.User;
import com.ashim.service.UserService;

@Controller
@SessionAttributes("lockScreenSession")
public class LoginController
{
	@Autowired
	private UserService userService;

	String returnPage = "";

	@RequestMapping(value = "/login.html", method = RequestMethod.GET)
	public String getLoginForm(Map<String, Object> map, @RequestParam(value = "errMsg",
			defaultValue = "") String errMsg, SessionStatus status, WebRequest request,
								HttpSession session)
	{
		// Clear session if found
		if (session.getAttribute("userSession") != null)
		{
			status.setComplete();
			request.removeAttribute("userSession", WebRequest.SCOPE_SESSION);
			request.removeAttribute("menuModelSession", WebRequest.SCOPE_SESSION);
		}

		map.put("user", new User());
		map.put("errMsg", errMsg);

		return "/login";
	}

	@RequestMapping(value = "/lockScreen.html", method = RequestMethod.GET)
	public String getLoginScreenForm(Map<String, Object> map, @RequestParam(value = "errMsg",
			defaultValue = "") String errMsg, WebRequest request, HttpSession session)
	{
		returnPage = "/lockScreen";

		User user = (User) session.getAttribute("lockScreenSession");

		if (user == null)
		{
			user = (User) session.getAttribute("userSession");

			// Clean Session
			request.removeAttribute("userSession", WebRequest.SCOPE_SESSION);
			request.removeAttribute("menuModelSession", WebRequest.SCOPE_SESSION);
		}

		map.put("lockScreenSession", user);
		map.put("errMsg", errMsg);
		map.put("user", user);

		return returnPage;
	}
}