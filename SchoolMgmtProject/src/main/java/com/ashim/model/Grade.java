package com.ashim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grade")
public class Grade
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "grade_id")
	private Integer gradeId;

	@Column(name = "grade_name")
	private Integer gradeName;

	@Column(name = "grade_desc")
	private String gradeDesc;

	public Integer getGradeId()
	{
		return gradeId;
	}

	public void setGradeId(Integer gradeId)
	{
		this.gradeId = gradeId;
	}

	public Integer getGradeName()
	{
		return gradeName;
	}

	public void setGradeName(Integer gradeName)
	{
		this.gradeName = gradeName;
	}

	public String getGradeDesc()
	{
		return gradeDesc;
	}

	public void setGradeDesc(String gradeDesc)
	{
		this.gradeDesc = gradeDesc;
	}
}