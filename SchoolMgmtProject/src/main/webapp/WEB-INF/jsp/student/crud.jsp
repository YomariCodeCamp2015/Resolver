<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/form"%>

<t:template>
<jsp:body>

<div class="row">
	<div class="col-md-12">
		<div class="panel panel-gradient" data-collapsed="0">
			<div class="panel-heading">
				<div class="panel-title"></div>
			</div>

			<div class="panel-body">

				<form:form id="form" method="post" action="crud.html" commandName="student" 
					role="form" cssClass="form-wizard validate">

					<form:hidden path="studentId" />
					<form:hidden path="userForStudent.userId" />
					<form:hidden path="parents.parentsId" />

					<div class="steps-progress">
						<div class="progress-indicator"></div>
					</div>

					<ul>
						<li class="active">
							<a href="#tab-1" data-toggle="tab">
								<span>1</span>Student Info</a>
						</li>
						<li>
							<a href="#tab-2" data-toggle="tab">
								<span>2</span>Parents Info</a>
						</li>
						<li>
							<a href="#tab-3" data-toggle="tab">
								<span>3</span>Contact Info</a>
						</li>
						<li>
							<a href="#tab-4" data-toggle="tab">
								<span>4</span>Register</a>
						</li>
					</ul>

					<div class="tab-content">
						<div class="tab-pane active" id="tab-1">
							<div class="row">
								<div class="col-md-8">
									<div class="form-group">
										<form:label path="studentName" cssClass="control-label">Name</form:label>

										<form:input path="studentName" cssClass="form-control" 
											name="name" data-validate="required" placeholder="Enter your full name" />
									</div>
								</div>
								
								<div class="col-md-4">
									<div class="form-group">
										<form:label path="studentRollNo" cssClass="control-label">Roll No.</form:label>
				
										<form:input path="studentRollNo"
											cssClass="form-control" name="number" data-validate="number"
											placeholder="Number Only" />
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-md-2">
									<div class="form-group">
										<form:label path="studentGender" cssClass="control-label">Gender</form:label>

										<br />

										<div class="make-switch switch-small" data-on-label="M" data-off-label="F">
											<form:checkbox path="studentGender" value="Male" />
										</div>
									</div>
								</div>
								
								<div class="col-md-6">
									<div class="form-group">
										<form:label path="studentDob" cssClass="control-label">Date Of Birth</form:label>

										<form:input path="studentDob" cssClass="form-control datepicker" 
											name="name" data-start-view="1" data-mask="date" 
											data-validate="required" placeholder="Date of birth"/>
									</div>
								</div>
								
								<div class="col-md-4">
									<div class="form-group">
										<form:label path="section.sectionId" cssClass="control-label">Section</form:label>
						
										<form:select path="section.sectionId" 
											cssClass="select2" data-allow-clear="true" 
											data-validate="required" data-placeholder="Select section..." >
											
											<option></option>
											<form:options items="${sectionMap}" />
										
										</form:select>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<form:label path="studentDiscount" cssClass="control-label">Discount</form:label>
										
										<form:input path="studentDiscount"
											cssClass="form-control" name="number" data-validate="number"
											placeholder="Number Only" />
									</div>
								</div>

								<div class="col-md-6">
									<div class="form-group">
										<form:label path="studentStatus" cssClass="control-label">Status</form:label>
										
										<form:select path="studentStatus" 
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
										<form:label path="parents.parentsName" cssClass="control-label">Name</form:label>

										<form:input path="parents.parentsName" cssClass="form-control" 
											name="name" data-validate="required" placeholder="Enter your full name" />
									</div>
								</div>
							</div>
							
							<div class="row">
								<div class="col-md-2">
									<div class="form-group">
										<form:label path="parents.parentsGender" cssClass="control-label">Gender</form:label>

										<br />

										<div class="make-switch switch-small" data-on-label="M" data-off-label="F">
											<form:checkbox path="parents.parentsGender" value="Male" />
										</div>
									</div>
								</div>
								
								<div class="col-md-10">
									<div class="form-group">
										<form:label path="parents.parentsRelationship" 
											cssClass="control-label">Relationship</form:label>

										<form:input path="parents.parentsRelationship" cssClass="form-control" 
											name="name" data-validate="required" placeholder="Your relationship" />
									</div>
								</div>
							</div>
						</div>
						
						<div class="tab-pane" id="tab-3">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<form:label path="parents.parentsEmail" cssClass="control-label">Email</form:label>

			                            <form:input path="parents.parentsEmail" cssClass="form-control" name="email" 
			                            	data-validate="email" placeholder="Enter your email" />
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<form:label path="parents.parentsStreet" cssClass="control-label">Street</form:label>

										<form:input path="parents.parentsStreet" cssClass="form-control" 
											name="name" data-validate="required" placeholder="Enter your street name" />
									</div>
								</div>

								<div class="col-md-6">
									<div class="form-group">
										<form:label path="parents.parentsCity" 
											cssClass="control-label">City</form:label>

										<form:input path="parents.parentsCity" cssClass="form-control" 
											name="name" data-validate="required" placeholder="Enter your city name" />
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<form:label path="parents.parentsPhoneNo" 
											cssClass="control-label">Phone No.</form:label>

										<form:input path="parents.parentsPhoneNo" 
											cssClass="form-control" name="name" />
									</div>
								</div>

								<div class="col-md-6">
									<div class="form-group">
										<form:label path="parents.parentsMobileNo" 
											cssClass="control-label">Mobile No.</form:label>

										<form:input path="parents.parentsMobileNo" cssClass="form-control" name="name" />
									</div>
								</div>
							</div>
						</div>
						
						<div class="tab-pane" id="tab-4">
							<div class="form-group">
								<form:label path="userForStudent.userName" cssClass="control-label">Choose Username</form:label>
	
								<div class="input-group">
									<div class="input-group-addon">
										<i class="entypo-user"></i>
									</div>
	
									<form:input path="userForStudent.userName" cssClass="form-control" name="username" id="username"
										data-validate="required,minlength[5]"
										data-message-minlength="Username must have minimum of 5 chars."
										placeholder="Could also be your email" />
								</div>
							</div>

							<div class="row">

								<div class="col-md-6">
									<div class="form-group">
										<form:label path="userForStudent.userPass" cssClass="control-label">Choose Password</form:label>

										<div class="input-group">
											<div class="input-group-addon">
												<i class="entypo-key"></i>
											</div>

											<form:password path="userForStudent.userPass" cssClass="form-control" name="password" id="password"
												data-validate="required" placeholder="Enter strong password" />
										</div>
									</div>
								</div>

								<div class="col-md-6">
									<div class="form-group">
										<form:label path="userForStudent.userPass" cssClass="control-label">Repeat Password</form:label>

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
									<form:label path="userForStudent.role.roleId" cssClass="control-label">Role</form:label>
									
									<form:select path="userForStudent.role.roleId" 
										cssClass="select2" data-allow-clear="true" 
										data-validate="required" data-placeholder="Select role..." >
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