package com.ashim.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.ashim.common.Utility;

@Entity
@Table(name = "staff")
public class Staff
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staff_id")
	private Integer staffId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User userForStaff;

	@OneToOne(mappedBy = "staffForEducation", cascade = CascadeType.ALL)
	private StaffEducation staffEducation;

	@OneToOne(mappedBy = "staffForWork", cascade = CascadeType.ALL)
	private StaffWorkExp staffWorkExp;

	@Column(name = "staff_type")
	private String staffType;

	@Column(name = "staff_name")
	private String staffName;

	@Column(name = "staff_gender")
	private String staffGender;

	@Column(name = "staff_street")
	private String staffStreet;

	@Column(name = "staff_city")
	private String staffCity;

	@Column(name = "staff_dob")
	private Date staffDob;

	@Column(name = "staff_phone_no")
	private String staffPhoneNo;

	@Column(name = "staff_mobile_no")
	private String staffMobileNo;

	@Column(name = "staff_email")
	private String staffEmail;

	@Column(name = "staff_status")
	private String staffStatus;

	public Integer getStaffId()
	{
		return staffId;
	}

	public void setStaffId(Integer staffId)
	{
		this.staffId = staffId;
	}

	public User getUserForStaff()
	{
		return userForStaff;
	}

	public void setUserForStaff(User userForStaff)
	{
		this.userForStaff = userForStaff;
	}

	public StaffWorkExp getStaffWorkExp()
	{
		return staffWorkExp;
	}

	public void setStaffWorkExp(StaffWorkExp staffWorkExp)
	{
		this.staffWorkExp = staffWorkExp;
	}

	public StaffEducation getStaffEducation()
	{
		return staffEducation;
	}

	public void setStaffEducation(StaffEducation staffEducation)
	{
		this.staffEducation = staffEducation;
	}

	public String getStaffType()
	{
		return staffType;
	}

	public void setStaffType(String staffType)
	{
		this.staffType = staffType;
	}

	public String getStaffName()
	{
		return Utility.toTitleCase(staffName);
	}

	public void setStaffName(String staffName)
	{
		this.staffName = staffName;
	}

	public String getStaffGender()
	{
		if (staffGender == null)
		{
			staffGender = "Male";
		}

		return staffGender;
	}

	public void setStaffGender(String staffGender)
	{
		if (staffGender == null)
		{
			staffGender = "Female";
		}

		this.staffGender = staffGender;
	}

	public String getStaffStreet()
	{
		return staffStreet;
	}

	public void setStaffStreet(String staffStreet)
	{
		this.staffStreet = staffStreet;
	}

	public String getStaffCity()
	{
		return staffCity;
	}

	public void setStaffCity(String staffCity)
	{
		this.staffCity = staffCity;
	}

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date getStaffDob()
	{
		return staffDob;
	}

	public void setStaffDob(Date staffDob)
	{
		this.staffDob = staffDob;
	}

	public String getStaffPhoneNo()
	{
		return staffPhoneNo;
	}

	public void setStaffPhoneNo(String staffPhoneNo)
	{
		this.staffPhoneNo = staffPhoneNo;
	}

	public String getStaffMobileNo()
	{
		return staffMobileNo;
	}

	public void setStaffMobileNo(String staffMobileNo)
	{
		this.staffMobileNo = staffMobileNo;
	}

	public String getStaffEmail()
	{
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail)
	{
		this.staffEmail = staffEmail;
	}

	public String getStaffStatus()
	{
		return staffStatus;
	}

	public void setStaffStatus(String staffStatus)
	{
		this.staffStatus = staffStatus;
	}
}