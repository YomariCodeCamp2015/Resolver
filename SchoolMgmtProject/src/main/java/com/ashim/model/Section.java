package com.ashim.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "section")
public class Section
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "section_id")
	private Integer sectionId;

	@ManyToOne(cascade = { CascadeType.REFRESH })
	@JoinColumn(name = "grade_id")
	private Grade grade;

	@OneToMany(mappedBy = "section")
	private List<Student> studentList;

	@Column(name = "section_name")
	private String sectionName;

	@Column(name = "section_desc")
	private String sectionDesc;

	public Integer getSectionId()
	{
		return sectionId;
	}

	public void setSectionId(Integer sectionId)
	{
		this.sectionId = sectionId;
	}

	public Grade getGrade()
	{
		return grade;
	}

	public void setGrade(Grade grade)
	{
		this.grade = grade;
	}

	public String getSectionName()
	{
		return sectionName;
	}

	public void setSectionName(String sectionName)
	{
		this.sectionName = sectionName;
	}

	public String getSectionDesc()
	{
		return sectionDesc;
	}

	public void setSectionDesc(String sectionDesc)
	{
		this.sectionDesc = sectionDesc;
	}
}