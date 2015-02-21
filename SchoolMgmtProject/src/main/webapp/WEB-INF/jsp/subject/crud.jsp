<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/form"%>

<t:template>
<jsp:body>

<form:form method="post"
    action="crud.html"
    commandName="subject" role="form"
    cssClass="form-horizontal form-groups-bordered validate">

<form:hidden path="subjectId" />

<div class="row">
    <div class="col-md-12">

        <div class="panel panel-gradient" data-collapsed="0">

            <div class="panel-heading">
                <div class="panel-title">
                </div>

                <div class="panel-options">
                    <a href="#" data-rel="collapse"><i
                        class="entypo-down-open"></i></a>
                    </div>
                </div>

                <div class="panel-body">

                    <div class="form-group">
                        <form:label path="subjectName" cssClass="col-sm-3 control-label">
                            Subject Name
                        </form:label>

                        <div class="col-sm-5">
                            <form:input path="subjectName"
                                cssClass="form-control" name="name" data-validate="required"
                                data-message-required="Subject name required."
                                placeholder="Subject Name" />
                        </div>
                    </div>
                                
					<div class="form-group">
						<form:label path="grade.gradeId" cssClass="col-sm-3 control-label">Grade</form:label>
						
						<div class="col-sm-5">
							<form:select path="grade.gradeId" 
								cssClass="select2" data-allow-clear="true" 
								data-placeholder="Select grade..." >
								
								<option></option>
								
								<form:options items="${gradeMap}" />
							
							</form:select>
						</div>
					</div>
                                
					<div class="form-group">
						<form:label path="staff.staffId" cssClass="col-sm-3 control-label">Staff</form:label>
						
						<div class="col-sm-5">
							<form:select path="staff.staffId" 
								cssClass="select2" data-allow-clear="true" 
								data-placeholder="Select staff..." >
								
								<option></option>
								
								<form:options items="${staffMap}" />
							
							</form:select>
						</div>
					</div>
					                                
					<div class="form-group">
						<form:label path="subjectDesc" cssClass="col-sm-3 control-label">Description</form:label>
						
						<div class="col-sm-5">
							<form:textarea path="subjectDesc"
								cssClass="form-control autogrow" name="name"
								placeholder="Description" />
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