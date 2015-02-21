package com.ashim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ashim.common.Utility;

@Entity
@Table(name = "menu_info")
public class MenuInfo
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menu_info_id")
	private Integer menuInfoId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "menu_model_id")
	private MenuModel menuModel;

	@Column(name = "menu_info_name")
	private String menuInfoName;

	@Column(name = "menu_info_url")
	private String menuInfoUrl;

	@Override
	public int hashCode()
	{
		return new Integer(menuInfoId).hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null)
		{
			return false;
		}

		if (!(obj instanceof MenuInfo))
		{
			return false;
		}

		if (this == (MenuInfo) obj)
		{
			return true;
		}

		return this.menuInfoId == ((MenuInfo) obj).getMenuInfoId();
	}

	public Integer getMenuInfoId()
	{
		return menuInfoId;
	}

	public void setMenuInfoId(Integer menuInfoId)
	{
		this.menuInfoId = menuInfoId;
	}

	public MenuModel getMenuModel()
	{
		return menuModel;
	}

	public void setMenuModel(MenuModel menuModel)
	{
		this.menuModel = menuModel;
	}

	public String getMenuInfoName()
	{
		return Utility.toTitleCase(menuInfoName);
	}

	public void setMenuInfoName(String menuInfoName)
	{
		this.menuInfoName = menuInfoName;
	}

	public String getMenuInfoUrl()
	{
		return menuInfoUrl;
	}

	public void setMenuInfoUrl(String menuInfoUrl)
	{
		this.menuInfoUrl = menuInfoUrl;
	}
}