package com.ashim.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ashim.common.Utility;

@Entity
@Table(name = "menu_model")
public class MenuModel
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menu_model_id")
	private Integer menuModelId;

	@Column(name = "menu_model_name")
	private String menuModelName;

	@Column(name = "menu_model_icon")
	private String menuModelIcon;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "menuModel")
	private List<MenuInfo> menuInfoList;

	public Integer getMenuModelId()
	{
		return menuModelId;
	}

	public void setMenuModelId(Integer menuModelId)
	{
		this.menuModelId = menuModelId;
	}

	public String getMenuModelName()
	{
		return Utility.toTitleCase(menuModelName);
	}

	public void setMenuModelName(String menuModelName)
	{
		this.menuModelName = menuModelName;
	}

	public String getMenuModelIcon()
	{
		return menuModelIcon;
	}

	public void setMenuModelIcon(String menuModelIcon)
	{
		this.menuModelIcon = menuModelIcon;
	}

	public List<MenuInfo> getMenuInfoList()
	{
		return menuInfoList;
	}

	public void setMenuInfoList(List<MenuInfo> menuInfoList)
	{
		this.menuInfoList = menuInfoList;
	}
}