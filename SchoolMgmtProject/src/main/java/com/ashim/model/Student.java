package com.ashim.model;

import java.util.Date;

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

import org.springframework.format.annotation.DateTimeFormat;

import com.ashim.common.Utility;

@Entity
@Table(name = "student")
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer studentId;

	@ManyToOne(cascade = { CascadeType.REFRESH })
	@JoinColumn(name = "section_id")
	private Section section;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User userForStudent;

	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	private Parents parents;

	@Column(name = "student_roll_no")
	private Integer studentRollNo;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "student_gender")
	private String studentGender;

	@Column(name = "student_dob")
	private Date studentDob;

	@Column(name = "student_discount")
	private Integer studentDiscount;

	@Column(name = "student_status")
	private String studentStatus;

	public Integer getStudentId()
	{
		return studentId;
	}

	public void setStudentId(Integer studentId)
	{
		this.studentId = studentId;
	}

	public Section getSection()
	{
		return section;
	}

	public void setSection(Section section)
	{
		this.section = section;
	}

	public User getUserForStudent()
	{
		return userForStudent;
	}

	public void setUserForStudent(User userForStudent)
	{
		this.userForStudent = userForStudent;
	}

	public Parents getParents()
	{
		return parents;
	}

	public void setParents(Parents parents)
	{
		this.parents = parents;
	}

	public Integer getStudentRollNo()
	{
		return studentRollNo;
	}

	public void setStudentRollNo(Integer studentRollNo)
	{
		this.studentRollNo = studentRollNo;
	}

	public String getStudentName()
	{
		return Utility.toTitleCase(studentName);
	}

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}

	public String getStudentGender()
	{
		if (studentGender == null)
		{
			studentGender = "Male";
		}

		return studentGender;
	}

	public void setStudentGender(String studentGender)
	{
		if (studentGender == null)
		{
			studentGender = "Female";
		}

		this.studentGender = studentGender;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStudentDob()
	{
		return studentDob;
	}

	public void setStudentDob(Date studentDob)
	{
		this.studentDob = studentDob;
	}

	public Integer getStudentDiscount()
	{
		return studentDiscount;
	}

	public void setStudentDiscount(Integer studentDiscount)
	{
		this.studentDiscount = studentDiscount;
	}

	public String getStudentStatus()
	{
		return studentStatus;
	}

	public void setStudentStatus(String studentStatus)
	{
		this.studentStatus = studentStatus;
	}
}