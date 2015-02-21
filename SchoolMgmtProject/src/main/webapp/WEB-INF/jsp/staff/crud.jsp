<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/form"%>

<t:template>
<jsp:body>

<div class="row">
	<div class="col-md-12">
		<div class="panel panel-primary" data-collapsed="0">
			<div class="panel-heading">
				<div class="panel-title"></div>
			</div>

			<div class="panel-body">

				<form:form id="form" method="post" action="crud.html" commandName="staff" 
					role="form" cssClass="form-wizard validate">

					<form:hidden path="staffId" />
					<form:hidden path="userForStaff.userId" />
					<form:hidden path="staffEducation.staffEduId" />
					<form:hidden path="staffWorkExp.staffWorkExpId" />

					<div class="steps-progress">
						<div class="progress-indicator"></div>
					</div>

					<ul>
						<li class="active">
							<a href="#tab-1" data-toggle="tab">
								<span>1</span>Personal Info</a>
						</li>
						<li>
							<a href="#tab-2" data-toggle="tab">
								<span>2</span>Address</a>
						</li>
						<li>
							<a href="#tab-3" data-toggle="tab">
								<span>3</span>Education</a>
						</li>
						<li>
							<a href="#tab-4" data-toggle="tab">
								<span>4</span>Work Experience</a>
						</li>
						<li>
							<a href="#tab-5" data-toggle="tab">
								<span>5</span>Register</a>
						</li>
					</ul>

					<div class="tab-content">
						<div class="tab-pane active" id="tab-1">
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<form:label path="staffName" cssClass="control-label">Staff Name</form:label>

										<form:input path="staffName" cssClass="form-control" 
											name="name" data-validate="required" placeholder="Enter your full name" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffGender" cssClass="control-label">Gender</form:label>

										<br />

										<div class="make-switch switch-small" data-on-label="M" data-off-label="F">
											<form:checkbox path="staffGender" value="Male" />
										</div>
									</div>
								</div>
								
								<div class="col-md-4">
									<div class="form-group">
										<form:label path="staffDob" cssClass="control-label">Date Of Birth</form:label>

										<form:input path="staffDob" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" 
											data-validate="required" placeholder="Date of birth"/>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<form:label path="staffType" cssClass="control-label">Staff Type</form:label>
						
										<form:select path="staffType" 
											cssClass="select2" data-allow-clear="true" 
											data-validate="required" data-placeholder="Select staff type" >
											
											<option></option>
											<form:option value="Staff" label="Staff" />
											<form:option value="Teacher" label="Teacher" />
											
										</form:select>
									</div>
								</div>

								<div class="col-md-6">
									<div class="form-group">
										<form:label path="staffStatus" cssClass="control-label">Status</form:label>
										
										<form:select path="staffStatus" 
											cssClass="select2" data-allow-clear="true" 
											data-validate="required" data-placeholder="Select status" >
											
											<option></option>
											<form:option value="Yes" label="Yes" />
											<form:option value="No" label="No" />
											
										</form:select>
									</div>
								</div>
							</div>
						</div>

						<div class="tab-pane" id="tab-2">
							<div class="row">

								<div class="col-md-12">
									<div class="form-group">
										<form:label path="staffEmail" cssClass="control-label">Email</form:label>

			                            <form:input path="staffEmail" cssClass="form-control" name="email" 
			                            	data-validate="email" placeholder="Enter your email" />
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<form:label path="staffStreet" cssClass="control-label">Street</form:label>

										<form:input path="staffStreet" cssClass="form-control" 
											name="name" data-validate="required" placeholder="Enter your street name" />
									</div>
								</div>

								<div class="col-md-6">
									<div class="form-group">
										<form:label path="staffCity" cssClass="control-label">City</form:label>

										<form:input path="staffCity" cssClass="form-control" 
											name="name" data-validate="required" placeholder="Enter your city name" />
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<form:label path="staffPhoneNo" cssClass="control-label">Phone No.</form:label>

										<form:input path="staffPhoneNo" cssClass="form-control" name="name" />
									</div>
								</div>

								<div class="col-md-6">
									<div class="form-group">
										<form:label path="staffMobileNo" cssClass="control-label">Mobile No.</form:label>

										<form:input path="staffMobileNo" cssClass="form-control" name="name" />
									</div>
								</div>
							</div>
						</div>
						
						<div class="tab-pane" id="tab-3">
							<div class="row">
								<strong>University</strong>
								<br />

								<div class="col-md-4">
									<div class="form-group">
										<form:label path="staffEducation.staffEduUniName" cssClass="control-label">Name</form:label>

										<form:input path="staffEducation.staffEduUniName" cssClass="form-control" 
											name="name" placeholder="Enter your university name" />
									</div>
								</div>

								<div class="col-md-4">
									<div class="form-group">
										<form:label path="staffEducation.staffEduUniFaculty" cssClass="control-label">Facutly</form:label>

										<form:input path="staffEducation.staffEduUniFaculty" cssClass="form-control" 
											name="name" placeholder="Enter your faculty name" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffEducation.staffEduUniStartDate" cssClass="control-label">Start Date</form:label>

										<form:input path="staffEducation.staffEduUniStartDate" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="Start date" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffEducation.staffEduUniEndDate" cssClass="control-label">End Date</form:label>

										<form:input path="staffEducation.staffEduUniEndDate" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="End date" />
									</div>
								</div>
							</div>

							<div class="row">
								<strong>College</strong>
								<br />

								<div class="col-md-8">
									<div class="form-group">
										<form:label path="staffEducation.staffEduCollName" cssClass="control-label">Name</form:label>

										<form:input path="staffEducation.staffEduCollName" cssClass="form-control" 
											name="name" placeholder="Enter your college name" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffEducation.staffEduCollStartDate" cssClass="control-label">Start Date</form:label>

										<form:input path="staffEducation.staffEduCollStartDate" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="Start date" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffEducation.staffEduCollEndDate" cssClass="control-label">End Date</form:label>

										<form:input path="staffEducation.staffEduCollEndDate" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="End date" />
									</div>
								</div>
							</div>

							<div class="row">
								<strong>School</strong>
								<br />

								<div class="col-md-8">
									<div class="form-group">
										<form:label path="staffEducation.staffEduSchName" cssClass="control-label">Name</form:label>

										<form:input path="staffEducation.staffEduSchName" cssClass="form-control" 
											name="name" placeholder="Enter your school name" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffEducation.staffEduSchStartDate" cssClass="control-label">Start Date</form:label>

										<form:input path="staffEducation.staffEduSchStartDate" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="Start date" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffEducation.staffEduSchEndDate" cssClass="control-label">End Date</form:label>

										<form:input path="staffEducation.staffEduSchEndDate" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="End date" />
									</div>
								</div>
							</div>
						</div>
						
						<div class="tab-pane" id="tab-4">
							<strong>Current &amp; Past Jobs</strong>
							<br />
							<br />
	
							<div class="row">
								<div class="col-md-1">
									<label class="control-label">&nbsp;</label>
									<p class="text-right">
										<span class="label label-info">1</span>
									</p>
								</div>

								<div class="col-md-3">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpComName1" cssClass="control-label">Company Name</form:label>

										<form:input path="staffWorkExp.staffWorkExpComName1" cssClass="form-control" 
											name="name" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-4">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpJobPos1" cssClass="control-label">Job Position</form:label>

										<form:input path="staffWorkExp.staffWorkExpJobPos1" cssClass="form-control" 
											name="name" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpStartDate1" cssClass="control-label">Start Date</form:label>

										<form:input path="staffWorkExp.staffWorkExpStartDate1" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpEndDate1" cssClass="control-label">End Date</form:label>

										<form:input path="staffWorkExp.staffWorkExpEndDate1" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="(Optional)" />
									</div>
								</div>
							</div>
	
							<div class="row">
								<div class="col-md-1">
									<label class="control-label">&nbsp;</label>
									<p class="text-right">
										<span class="label label-info">2</span>
									</p>
								</div>

								<div class="col-md-3">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpComName2" cssClass="control-label">Company Name</form:label>

										<form:input path="staffWorkExp.staffWorkExpComName2" cssClass="form-control" 
											name="name" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-4">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpJobPos2" cssClass="control-label">Job Position</form:label>

										<form:input path="staffWorkExp.staffWorkExpJobPos2" cssClass="form-control" 
											name="name" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpStartDate2" cssClass="control-label">Start Date</form:label>

										<form:input path="staffWorkExp.staffWorkExpStartDate2" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpEndDate2" cssClass="control-label">End Date</form:label>

										<form:input path="staffWorkExp.staffWorkExpEndDate2" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="(Optional)" />
									</div>
								</div>
							</div>
	
							<div class="row">
								<div class="col-md-1">
									<label class="control-label">&nbsp;</label>
									<p class="text-right">
										<span class="label label-info">3</span>
									</p>
								</div>

								<div class="col-md-3">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpComName3" cssClass="control-label">Company Name</form:label>

										<form:input path="staffWorkExp.staffWorkExpComName3" cssClass="form-control" 
											name="name" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-4">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpJobPos3" cssClass="control-label">Job Position</form:label>

										<form:input path="staffWorkExp.staffWorkExpJobPos3" cssClass="form-control" 
											name="name" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpStartDate3" cssClass="control-label">Start Date</form:label>

										<form:input path="staffWorkExp.staffWorkExpStartDate3" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpEndDate3" cssClass="control-label">End Date</form:label>

										<form:input path="staffWorkExp.staffWorkExpEndDate3" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="(Optional)" />
									</div>
								</div>
							</div>
	
							<div class="row">
								<div class="col-md-1">
									<label class="control-label">&nbsp;</label>
									<p class="text-right">
										<span class="label label-info">4</span>
									</p>
								</div>

								<div class="col-md-3">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpComName4" cssClass="control-label">Company Name</form:label>

										<form:input path="staffWorkExp.staffWorkExpComName4" cssClass="form-control" 
											name="name" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-4">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpJobPos4" cssClass="control-label">Job Position</form:label>

										<form:input path="staffWorkExp.staffWorkExpJobPos4" cssClass="form-control" 
											name="name" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpStartDate4" cssClass="control-label">Start Date</form:label>

										<form:input path="staffWorkExp.staffWorkExpStartDate4" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="(Optional)" />
									</div>
								</div>

								<div class="col-md-2">
									<div class="form-group">
										<form:label path="staffWorkExp.staffWorkExpEndDate4" cssClass="control-label">End Date</form:label>

										<form:input path="staffWorkExp.staffWorkExpEndDate4" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" placeholder="(Optional)" />
									</div>
								</div>
							</div>
						</div>
						
						<div class="tab-pane" id="tab-5">
							<div class="form-group">
								<form:label path="userForStaff.userName" cssClass="control-label">Choose Username</form:label>
	
								<div class="input-group">
									<div class="input-group-addon">
										<i class="entypo-user"></i>
									</div>
	
									<form:input path="userForStaff.userName" cssClass="form-control" name="username" id="username"
										data-validate="required,minlength[5]"
										data-message-minlength="Username must have minimum of 5 chars."
										placeholder="Could also be your email" />
								</div>
							</div>

							<div class="row">

								<div class="col-md-6">
									<div class="form-group">
										<form:label path="userForStaff.userPass" cssClass="control-label">Choose Password</form:label>

										<div class="input-group">
											<div class="input-group-addon">
												<i class="entypo-key"></i>
											</div>

											<form:password path="userForStaff.userPass" cssClass="form-control" name="password" id="password"
												data-validate="required" placeholder="Enter strong password" />
										</div>
									</div>
								</div>

								<div class="col-md-6">
									<div class="form-group">
										<form:label path="userForStaff.userPass" cssClass="control-label">Repeat Password</form:label>

										<div class="input-group">
											<div class="input-group-addon">
												<i class="entypo-cw"></i>
											</div>

											<input type="password" class="form-control" name="password" id="password"
												data-validate="required,equalTo[#password]"
												data-message-equal-to="Passwords doesn't match."
												placeholder="Confirm password" />
										</div>
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
									<form:label path="userForStaff.role.roleId" cssClass="control-label">Role</form:label>
									
									<form:select path="userForStaff.role.roleId" 
										cssClass="select2" data-allow-clear="true" data-validate="required" 
										data-placeholder="Select role..." >
										<option></option>
										
										<form:options items="${roleMap}" />
									</form:select>
									</div>
								</div>
							</div>

							<div class="form-group">
								<button type="submit" class="btn btn-primary">Finish</button>
							</div>
						</div>

						<ul class="pager wizard">
							<li class="previous">
								<a href="#"><i class="entypo-left-open"></i> Previous</a>
							</li>

							<li class="next">
								<a href="#">Next <i class="entypo-right-open"></i></a>
							</li>
						</ul>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</div>

</jsp:body>
</t:template>