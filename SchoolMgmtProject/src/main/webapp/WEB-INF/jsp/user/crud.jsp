<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/form"%>

<t:template>
<jsp:body>

<form:form method="post"
    action="crud.html"
    commandName="user" role="form"
    cssClass="form-horizontal form-groups-bordered validate">

	<form:hidden path="userId"/>

<div class="row">
    <div class="col-md-12">

        <div class="panel panel-gradient" data-collapsed="0">

            <div class="panel-heading">
                <div class="panel-title">
                </div>
            </div>

                <div class="panel-body">

                    <div class="form-group">
                        <form:label path="userName" cssClass="col-sm-3 control-label">
                            User Name
                        </form:label>

                        <div class="col-sm-5">
                            <form:input path="userName"
                                cssClass="form-control" name="name" data-validate="required"
                                data-message-required="Enter user name"
                                placeholder="User Name" />
                        </div>
                    </div>

                    <div class="form-group">
                        <form:label path="userPass" cssClass="col-sm-3 control-label">
                            Password
                        </form:label>

                        <div class="col-sm-5">
                            <form:password path="userPass"
                                cssClass="form-control" name="name" id="password" 
                           		data-validate="required" placeholder="Enter strong password" />
                        </div>
                    </div>
                   
                   <div class="form-group">
                        <form:label path="userPass" cssClass="col-sm-3 control-label">
                            Repeat Password
                        </form:label>

                       <div class="col-sm-5">
                           <input type="password" class="form-control" name="password" id="password" 
                           		data-validate="required,equalTo[#password]" 
                           		data-message-equal-to="Passwords doesn't match." placeholder="Confirm password" />
                       </div>
                   </div>
                                
					<div class="form-group">
						<form:label path="role.roleId" cssClass="col-sm-3 control-label">Role</form:label>
						
						<div class="col-sm-5">
							<form:select path="role.roleId" 
								cssClass="select2" data-allow-clear="true" 
								data-placeholder="Select role..." >
								
								<option></option>
								
								<form:options items="${roleMap}" />
							
							</form:select>
						</div>
					</div>

                </div>

            </div>

        </div>
    </div>

    <div class="form-group default-padding">
        <button type="submit" class="btn btn-success">
            Save Changes
        </button>
        <button type="reset" class="btn">
            Reset Previous
        </button>
    </div>

</form:form>

</jsp:body>
</t:template>