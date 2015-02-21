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
@Table(name = "subject")
public class Subject
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subject_id")
	private Integer subjectId;

	@OneToOne(cascade = { CascadeType.REFRESH })
	@JoinColumn(name = "grade_id")
	private Grade grade;

	@ManyToOne(cascade = { CascadeType.REFRESH })
	@JoinColumn(name = "staff_id")
	private Staff staff;

	@Column(name = "subject_name")
	private String subjectName;

	@Column(name = "subject_desc")
	private String subjectDesc;

	public Integer getSubjectId()
	{
		return subjectId;
	}

	public void setSubjectId(Integer subjectId)
	{
		this.subjectId = subjectId;
	}

	public Grade getGrade()
	{
		return grade;
	}

	public void setGrade(Grade grade)
	{
		this.grade = grade;
	}

	public Staff getStaff()
	{
		return staff;
	}

	public void setStaff(Staff staff)
	{
		this.staff = staff;
	}

	public String getSubjectName()
	{
		return subjectName;
	}

	public void setSubjectName(String subjectName)
	{
		this.subjectName = subjectName;
	}

	public String getSubjectDesc()
	{
		return subjectDesc;
	}

	public void setSubjectDesc(String subjectDesc)
	{
		this.subjectDesc = subjectDesc;
	}
}