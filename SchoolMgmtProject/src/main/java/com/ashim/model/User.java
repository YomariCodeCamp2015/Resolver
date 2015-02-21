package com.ashim.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;

	@ManyToOne(cascade = { CascadeType.REFRESH })
	@JoinColumn(name = "role_id")
	private Role role;

	@OneToOne(mappedBy = "userForStudent")
	private Student student;

	@OneToOne(mappedBy = "userForStaff")
	private Staff staff;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_pass")
	private String userPass;

	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public Role getRole()
	{
		return role;
	}

	public void setRole(Role role)
	{
		this.role = role;
	}

	public Student getStudent()
	{
		return student;
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	public Staff getStaff()
	{
		return staff;
	}

	public void setStaff(Staff staff)
	{
		this.staff = staff;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getUserPass()
	{
		return userPass;
	}

	public void setUserPass(String userPass)
	{
		this.userPass = userPass;
	}
}