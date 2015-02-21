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
@Table(name = "staff_work_exp")
public class StaffWorkExp
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staff_work_exp_id")
	private Integer staffWorkExpId;

	@OneToOne
	@JoinColumn(name = "staff_id")
	private Staff staffForWork;

	@Column(name = "staff_work_exp_com_name_1")
	private String staffWorkExpComName1;

	@Column(name = "staff_work_exp_job_pos_1")
	private String staffWorkExpJobPos1;

	@Column(name = "staff_work_exp_start_date_1")
	private Date staffWorkExpStartDate1;

	@Column(name = "staff_work_exp_end_date_1")
	private Date staffWorkExpEndDate1;

	@Column(name = "staff_work_exp_com_name_2")
	private String staffWorkExpComName2;

	@Column(name = "staff_work_exp_job_pos_2")
	private String staffWorkExpJobPos2;

	@Column(name = "staff_work_exp_start_date_2")
	private Date staffWorkExpStartDate2;

	@Column(name = "staff_work_exp_end_date_2")
	private Date staffWorkExpEndDate2;

	@Column(name = "staff_work_exp_com_name_3")
	private String staffWorkExpComName3;

	@Column(name = "staff_work_exp_job_pos_3")
	private String staffWorkExpJobPos3;

	@Column(name = "staff_work_exp_start_date_3")
	private Date staffWorkExpStartDate3;

	@Column(name = "staff_work_exp_end_date_3")
	private Date staffWorkExpEndDate3;

	@Column(name = "staff_work_exp_com_name_4")
	private String staffWorkExpComName4;

	@Column(name = "staff_work_exp_job_pos_4")
	private String staffWorkExpJobPos4;

	@Column(name = "staff_work_exp_start_date_4")
	private Date staffWorkExpStartDate4;

	@Column(name = "staff_work_exp_end_date_4")
	private Date staffWorkExpEndDate4;

	public Integer getStaffWorkExpId()
	{
		return staffWorkExpId;
	}

	public void setStaffWorkExpId(Integer staffWorkExpId)
	{
		this.staffWorkExpId = staffWorkExpId;
	}

	public Staff getStaffWork()
	{
		return staffForWork;
	}

	public void setStaffWork(Staff staffWork)
	{
		this.staffForWork = staffWork;
	}

	public String getStaffWorkExpComName1()
	{
		return staffWorkExpComName1;
	}

	public void setStaffWorkExpComName1(String staffWorkExpComName1)
	{
		this.staffWorkExpComName1 = staffWorkExpComName1;
	}

	public String getStaffWorkExpJobPos1()
	{
		return staffWorkExpJobPos1;
	}

	public void setStaffWorkExpJobPos1(String staffWorkExpJobPos1)
	{
		this.staffWorkExpJobPos1 = staffWorkExpJobPos1;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffWorkExpStartDate1()
	{
		return staffWorkExpStartDate1;
	}

	public void setStaffWorkExpStartDate1(Date staffWorkExpStartDate1)
	{
		this.staffWorkExpStartDate1 = staffWorkExpStartDate1;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffWorkExpEndDate1()
	{
		return staffWorkExpEndDate1;
	}

	public void setStaffWorkExpEndDate1(Date staffWorkExpEndDate1)
	{
		this.staffWorkExpEndDate1 = staffWorkExpEndDate1;
	}

	public String getStaffWorkExpComName2()
	{
		return staffWorkExpComName2;
	}

	public void setStaffWorkExpComName2(String staffWorkExpComName2)
	{
		this.staffWorkExpComName2 = staffWorkExpComName2;
	}

	public String getStaffWorkExpJobPos2()
	{
		return staffWorkExpJobPos2;
	}

	public void setStaffWorkExpJobPos2(String staffWorkExpJobPos2)
	{
		this.staffWorkExpJobPos2 = staffWorkExpJobPos2;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffWorkExpStartDate2()
	{
		return staffWorkExpStartDate2;
	}

	public void setStaffWorkExpStartDate2(Date staffWorkExpStartDate2)
	{
		this.staffWorkExpStartDate2 = staffWorkExpStartDate2;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffWorkExpEndDate2()
	{
		return staffWorkExpEndDate2;
	}

	public void setStaffWorkExpEndDate2(Date staffWorkExpEndDate2)
	{
		this.staffWorkExpEndDate2 = staffWorkExpEndDate2;
	}

	public String getStaffWorkExpComName3()
	{
		return staffWorkExpComName3;
	}

	public void setStaffWorkExpComName3(String staffWorkExpComName3)
	{
		this.staffWorkExpComName3 = staffWorkExpComName3;
	}

	public String getStaffWorkExpJobPos3()
	{
		return staffWorkExpJobPos3;
	}

	public void setStaffWorkExpJobPos3(String staffWorkExpJobPos3)
	{
		this.staffWorkExpJobPos3 = staffWorkExpJobPos3;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffWorkExpStartDate3()
	{
		return staffWorkExpStartDate3;
	}

	public void setStaffWorkExpStartDate3(Date staffWorkExpStartDate3)
	{
		this.staffWorkExpStartDate3 = staffWorkExpStartDate3;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffWorkExpEndDate3()
	{
		return staffWorkExpEndDate3;
	}

	public void setStaffWorkExpEndDate3(Date staffWorkExpEndDate3)
	{
		this.staffWorkExpEndDate3 = staffWorkExpEndDate3;
	}

	public String getStaffWorkExpComName4()
	{
		return staffWorkExpComName4;
	}

	public void setStaffWorkExpComName4(String staffWorkExpComName4)
	{
		this.staffWorkExpComName4 = staffWorkExpComName4;
	}

	public String getStaffWorkExpJobPos4()
	{
		return staffWorkExpJobPos4;
	}

	public void setStaffWorkExpJobPos4(String staffWorkExpJobPos4)
	{
		this.staffWorkExpJobPos4 = staffWorkExpJobPos4;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffWorkExpStartDate4()
	{
		return staffWorkExpStartDate4;
	}

	public void setStaffWorkExpStartDate4(Date staffWorkExpStartDate4)
	{
		this.staffWorkExpStartDate4 = staffWorkExpStartDate4;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffWorkExpEndDate4()
	{
		return staffWorkExpEndDate4;
	}

	public void setStaffWorkExpEndDate4(Date staffWorkExpEndDate4)
	{
		this.staffWorkExpEndDate4 = staffWorkExpEndDate4;
	}
}