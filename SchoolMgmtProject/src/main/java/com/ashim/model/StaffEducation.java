package com.ashim.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "staff_education")
public class StaffEducation
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staff_edu_id")
	private Integer staffEduId;

	@OneToOne
	@JoinColumn(name = "staff_id")
	private Staff staffForEducation;

	@Column(name = "staff_edu_uni_faculty")
	private String staffEduUniFaculty;

	@Column(name = "staff_edu_uni_name")
	private String staffEduUniName;

	@Column(name = "staff_edu_uni_start_date")
	private Date staffEduUniStartDate;

	@Column(name = "staff_edu_uni_end_date")
	private Date staffEduUniEndDate;

	@Column(name = "staff_edu_coll_name")
	private String staffEduCollName;

	@Column(name = "staff_edu_coll_start_date")
	private Date staffEduCollStartDate;

	@Column(name = "staff_edu_coll_end_date")
	private Date staffEduCollEndDate;

	@Column(name = "staff_edu_sch_name")
	private String staffEduSchName;

	@Column(name = "staff_edu_sch_start_date")
	private Date staffEduSchStartDate;

	@Column(name = "staff_edu_sch_end_date")
	private Date staffEduSchEndDate;

	public Integer getStaffEduId()
	{
		return staffEduId;
	}

	public void setStaffEduId(Integer staffEduId)
	{
		this.staffEduId = staffEduId;
	}

	public Staff getStaffEdu()
	{
		return staffForEducation;
	}

	public void setStaffEdu(Staff staffEdu)
	{
		this.staffForEducation = staffEdu;
	}

	public String getStaffEduUniFaculty()
	{
		return staffEduUniFaculty;
	}

	public void setStaffEduUniFaculty(String staffEduUniFaculty)
	{
		this.staffEduUniFaculty = staffEduUniFaculty;
	}

	public String getStaffEduUniName()
	{
		return staffEduUniName;
	}

	public void setStaffEduUniName(String staffEduUniName)
	{
		this.staffEduUniName = staffEduUniName;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffEduUniStartDate()
	{
		return staffEduUniStartDate;
	}

	public void setStaffEduUniStartDate(Date staffEduUniStartDate)
	{
		this.staffEduUniStartDate = staffEduUniStartDate;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffEduUniEndDate()
	{
		return staffEduUniEndDate;
	}

	public void setStaffEduUniEndDate(Date staffEduUniEndDate)
	{
		this.staffEduUniEndDate = staffEduUniEndDate;
	}

	public String getStaffEduCollName()
	{
		return staffEduCollName;
	}

	public void setStaffEduCollName(String staffEduCollName)
	{
		this.staffEduCollName = staffEduCollName;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffEduCollStartDate()
	{
		return staffEduCollStartDate;
	}

	public void setStaffEduCollStartDate(Date staffEduCollStartDate)
	{
		this.staffEduCollStartDate = staffEduCollStartDate;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffEduCollEndDate()
	{
		return staffEduCollEndDate;
	}

	public void setStaffEduCollEndDate(Date staffEduCollEndDate)
	{
		this.staffEduCollEndDate = staffEduCollEndDate;
	}

	public String getStaffEduSchName()
	{
		return staffEduSchName;
	}

	public void setStaffEduSchName(String staffEduSchName)
	{
		this.staffEduSchName = staffEduSchName;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffEduSchStartDate()
	{
		return staffEduSchStartDate;
	}

	public void setStaffEduSchStartDate(Date staffEduSchStartDate)
	{
		this.staffEduSchStartDate = staffEduSchStartDate;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffEduSchEndDate()
	{
		return staffEduSchEndDate;
	}

	public void setStaffEduSchEndDate(Date staffEduSchEndDate)
	{
		this.staffEduSchEndDate = staffEduSchEndDate;
	}
}