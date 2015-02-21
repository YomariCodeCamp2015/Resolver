package com.ashim.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ashim.model.MenuInfo;
import com.ashim.model.MenuModel;

public class RequestInterceptor implements HandlerInterceptor
{
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object obj) throws Exception
	{
		boolean status = true;
		HttpSession session = request.getSession();

		if (session.getAttribute("userSession") == null
				|| session.getAttribute("menuModelSession") == null)
		{
			response.sendRedirect(request.getContextPath() + "/login.html");
			status = false;
		} else
		{
			setSideBarSession(request, session);
		}

		return status;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object obj, ModelAndView ex)
					throws Exception
	{
	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj, Exception ex)
					throws Exception
	{
	}

	public void setSideBarSession(HttpServletRequest request,
			HttpSession session)
	{
		String name = "";
		String path = request.getServletPath();

		@SuppressWarnings("unchecked")
		List<MenuModel> menuModelList = (List<MenuModel>) session
		.getAttribute("menuModelSession");

		for (MenuModel menuModel : menuModelList)
		{
			for (MenuInfo menuInfo : menuModel.getMenuInfoList())
			{
				if (menuInfo.getMenuInfoUrl().startsWith(
						path.substring(0, path.lastIndexOf("/"))))
				{
					name = menuModel.getMenuModelName();
				}
			}
		}

		session.setAttribute("sServletName", name);
		session.setAttribute("sServletPath", path);
	}
}