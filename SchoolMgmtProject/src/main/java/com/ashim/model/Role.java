package com.ashim.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private Integer roleId;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	@JoinTable(name = "role_menu_info", joinColumns = { @JoinColumn(name = "role_id") },
			inverseJoinColumns = { @JoinColumn(name = "menu_info_id") })
	private List<MenuInfo> menuInfoList;

	@Column(name = "role_name")
	private String roleName;

	@Column(name = "role_desc")
	private String roleDesc;

	public Integer getRoleId()
	{
		return roleId;
	}

	public void setRoleId(Integer roleId)
	{
		this.roleId = roleId;
	}

	public List<MenuInfo> getMenuInfoList()
	{
		return menuInfoList;
	}

	public void setMenuInfoList(List<MenuInfo> menuInfoList)
	{
		this.menuInfoList = menuInfoList;
	}

	public String getRoleName()
	{
		return roleName;
	}

	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
	}

	public String getRoleDesc()
	{
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc)
	{
		this.roleDesc = roleDesc;
	}
}