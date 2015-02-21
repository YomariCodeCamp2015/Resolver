package com.ashim.base;

import javax.servlet.http.HttpSession;

public abstract class BaseController
{
	public boolean checkSession(HttpSession session)
	{
		if (session.getAttribute("userSession") == null)
		{
			return false;
		}

		return true;
	}
}