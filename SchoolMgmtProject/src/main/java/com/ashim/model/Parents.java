package com.ashim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parents")
public class Parents
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "parents_id")
	private Integer parentsId;

	@OneToOne
	@JoinColumn(name = "student_id")
	private Student student;

	@Column(name = "parents_name")
	private String parentsName;

	@Column(name = "parents_gender")
	private String parentsGender;

	@Column(name = "parents_street")
	private String parentsStreet;

	@Column(name = "parents_city")
	private String parentsCity;

	@Column(name = "parents_phone_no")
	private String parentsPhoneNo;

	@Column(name = "parents_mobile_no")
	private String parentsMobileNo;

	@Column(name = "parents_email")
	private String parentsEmail;

	@Column(name = "parents_relationship")
	private String parentsRelationship;

	public Integer getParentsId()
	{
		return parentsId;
	}

	public void setParentsId(Integer parentsId)
	{
		this.parentsId = parentsId;
	}

	public Student getStudent()
	{
		return student;
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	public String getParentsName()
	{
		return parentsName;
	}

	public void setParentsName(String parentsName)
	{
		this.parentsName = parentsName;
	}

	public String getParentsGender()
	{
		if (parentsGender == null)
		{
			parentsGender = "Male";
		}

		return parentsGender;
	}

	public void setParentsGender(String parentsGender)
	{
		if (parentsGender == null)
		{
			parentsGender = "Female";
		}

		this.parentsGender = parentsGender;
	}

	public String getParentsStreet()
	{
		return parentsStreet;
	}

	public void setParentsStreet(String parentsStreet)
	{
		this.parentsStreet = parentsStreet;
	}

	public String getParentsCity()
	{
		return parentsCity;
	}

	public void setParentsCity(String parentsCity)
	{
		this.parentsCity = parentsCity;
	}

	public String getParentsPhoneNo()
	{
		return parentsPhoneNo;
	}

	public void setParentsPhoneNo(String parentsPhoneNo)
	{
		this.parentsPhoneNo = parentsPhoneNo;
	}

	public String getParentsMobileNo()
	{
		return parentsMobileNo;
	}

	public void setParentsMobileNo(String parentsMobileNo)
	{
		this.parentsMobileNo = parentsMobileNo;
	}

	public String getParentsEmail()
	{
		return parentsEmail;
	}

	public void setParentsEmail(String parentsEmail)
	{
		this.parentsEmail = parentsEmail;
	}

	public String getParentsRelationship()
	{
		return parentsRelationship;
	}

	public void setParentsRelationship(String parentsRelationship)
	{
		this.parentsRelationship = parentsRelationship;
	}
}