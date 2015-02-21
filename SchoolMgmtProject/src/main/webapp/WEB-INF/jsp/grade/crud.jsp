<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags/form"%>

<t:template>
<jsp:body>

<form:form method="post"
    action="crud.html"
    commandName="grade" role="form"
    cssClass="form-horizontal form-groups-bordered validate">

	<form:hidden path="gradeId"/>

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
                        <form:label path="gradeName" cssClass="col-sm-3 control-label">
                            Grade Name
                        </form:label>

						<div class="col-sm-5">
							<form:input path="gradeName"
								cssClass="form-control" name="number" data-validate="number"
								placeholder="Number Only" />
						</div>
                    </div>

                    <div class="form-group">
                        <form:label path="gradeDesc" cssClass="col-sm-3 control-label">
                            Description
                        </form:label>
						
						<div class="col-sm-5">
							<form:textarea path="gradeDesc"
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