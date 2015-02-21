package com.ashim.common;

import java.beans.PropertyEditorSupport;

import com.ashim.model.MenuInfo;

public class MenuInfoEditor extends PropertyEditorSupport
{
	@Override
	public void setAsText(String text)
	{
		MenuInfo menuInfo = new MenuInfo();
		menuInfo.setMenuInfoId(Integer.parseInt(text));
		this.setValue(menuInfo);
	}

	@Override
	public String getAsText()
	{
		MenuInfo menuInfo = (MenuInfo) this.getValue();

		if (menuInfo == null)
		{
			return null;
		}

		return menuInfo.getMenuInfoId().toString();
	}
}